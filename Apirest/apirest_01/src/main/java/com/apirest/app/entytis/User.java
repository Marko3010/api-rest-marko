package com.apirest.app.entytis;

import javax.persistence.*;

@Entity  // clase identidad, indica atributos
@Table(name = "users") // table crea una tabla en la base de datos
public class User {

    @Id // identificador unico
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremente en orden, va generar un valor unico
    private Integer id;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}







