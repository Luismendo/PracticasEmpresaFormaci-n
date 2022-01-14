package com.example._Database_DB1.Usuario.infrastructure.dto.input;

import com.example._Database_DB1.Usuario.domain.Usuario;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Component
public class UsuarioInputDTO{

    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String company_email;
    private String personal_email;
    private String city;
    private String active;
    private Date created_date;
    private String imagen_url;
    private Date termination_date;



    public Usuario Change(UsuarioInputDTO usuarioInputDTO) {
        Usuario usuario = new Usuario();
        //usuario.s.id = usuarioInputDTO.;
        usuario.setUsuario(usuarioInputDTO.getUsuario());
        usuario.setPassword(usuarioInputDTO.getPassword());
        usuario.setName(usuarioInputDTO.getName());
        usuario.setSurname(usuarioInputDTO.getSurname());
        usuario.setCompany_email(usuarioInputDTO.getCompany_email());
        usuario.setPersonal_email(usuarioInputDTO.getPersonal_email());
        usuario.setCity(usuarioInputDTO.getCity());

        if(usuarioInputDTO.getActive().equals("on")){
            usuario.setActive(true);
        }else {
            usuario.setActive(false);
        }

        usuario.setCreated_date(usuarioInputDTO.getCreated_date());
        usuario.setImagen_url(usuarioInputDTO.getImagen_url());
        usuario.setTermination_date(usuarioInputDTO.getTermination_date());

        return usuario;
    }
}
