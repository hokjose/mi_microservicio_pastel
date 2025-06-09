package com.example.ms_catalogo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity /*en este se marca una clase como una entidad que se va ha a mapear a una tabla en la base de datos*/
@Data  /*este sirve para poder generar los constructores*/
public class Categoria {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private String  apellido;
    private String  direccion;
    private String  telefono;

}
