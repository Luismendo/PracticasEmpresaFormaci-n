package com.example._Database_DB1;

import org.springframework.data.annotation.Id;

public class Usuario {
    @Id
    String id;

    String nombreUsuario;
    int edad;
    String ciudad;
}
