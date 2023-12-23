package com.apirest.app.entytis;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Table(name = "trabajador")
@Entity
public class Trabajador {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private int edad;

    private String direccion;

    private double salario;


}
