package com.example._Database_DB1.Persona.domain;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;



@Service
public class UsuarioRepositorioUseCase{

    @PersistenceContext
    EntityManager entityManager;

    public List<Persona> getData(HashMap<String, Object> conditions) throws UnprocesableException{
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Persona> query = cb.createQuery(Persona.class);
        Root<Persona> root = query.from(Persona.class);

        if(conditions.get("page") == null)
        {throw new UnprocesableException("getPersonal_email no puede ser nulo"); }

        List<Predicate> predicates = new ArrayList<>();
        conditions.forEach((field, value)->
        {
            switch (field){
                case "usuario":
                case "surname":
                case "name":
                    predicates.add(cb.equal(root.get(field),value));
                    break;
                case "created_date":
                    String DateCondit="";

                    if(conditions.get("date_condition") != null){
                        try {
                            DateCondit = (String) conditions.get("date_condition");
                        }catch (Exception e){

                        }

                    }


                    Path<Date> dateCreatedPath = root.get(field);
                    SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
                    Date date = null;
                    try {
                        date = formatter.parse((String)value);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    switch (DateCondit){

                        case "sup":
                            predicates.add(cb.greaterThan(dateCreatedPath,date));
                            break;
                        case "inf":
                            predicates.add(cb.lessThan(dateCreatedPath,date));
                            break;
                    }
                    break;

            }

        });
        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));

        String order="";

        if(conditions.get("ordenar") != null){
            try {
                order = (String) conditions.get("ordenar");
            }catch (Exception e){

            }
        }

        switch (order){

            case "name":
                query.orderBy(cb.asc(root.get("name")));
                break;
            case "usuario":
                query.orderBy(cb.asc(root.get("usuario")));
                break;
        }

        int page = (int)conditions.get("page");
        int tamano_pag = 10;

        if(conditions.get("tamano_pag") != null){
            tamano_pag = (int)conditions.get("tamano_pag");
        }


        return entityManager.createQuery(query)
                .setFirstResult(page*tamano_pag)
                .setMaxResults(page*tamano_pag+tamano_pag)
                .getResultList();
    }
}
