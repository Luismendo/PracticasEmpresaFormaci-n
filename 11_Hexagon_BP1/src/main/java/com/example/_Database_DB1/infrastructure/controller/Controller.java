package com.example._Database_DB1.infrastructure.controller;

import com.example._Database_DB1.domain.Usuario;
import com.example._Database_DB1.application.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @GetMapping
    public List<Usuario> getAll(){
        return usuarioRepositorio.findAll();
    }

    @GetMapping("id/{id}")

    public Usuario getById(@PathVariable int id) throws Exception{
        return usuarioRepositorio.findById(id).orElseThrow(() -> new Exception("No se encuentra"));
    }

    @GetMapping("name/{name}")
    public List<Usuario> getByName(@PathVariable String name){
        return usuarioRepositorio.findByName(name);
    }



    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) throws Exception {
        if (usuario.getUsuario()==null) {throw new Exception("Usuario no puede ser nulo"); }
        if (usuario.getUsuario().length()>10) { throw new Exception("Longitud de usuario no puede ser superior a 10 caracteres");}
        if (usuario.getPassword()==null) {throw new Exception("getPassword no puede ser nulo"); }
        if (usuario.getName()==null) {throw new Exception("getName no puede ser nulo"); }
        if (usuario.getCompany_email()==null) {throw new Exception("getCompany_email no puede ser nulo"); }
        if (usuario.getCity()==null) {throw new Exception("getCity no puede ser nulo"); }
        if (usuario.getActive()==null) {throw new Exception("getActive no puede ser nulo"); }
        if (usuario.getCreated_date()==null) {throw new Exception("getCreated_date no puede ser nulo"); }
        if (usuario.getPersonal_email()==null) {throw new Exception("getPersonal_email no puede ser nulo"); }

        usuarioRepositorio.save(usuario);
        return usuario;
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable int id) throws Exception {
        if(usuarioRepositorio.findById(id).isPresent()){
            usuarioRepositorio.deleteById(id);
        }
    }
}
