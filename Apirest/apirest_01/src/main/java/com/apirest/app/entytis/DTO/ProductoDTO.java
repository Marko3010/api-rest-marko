package com.apirest.app.entytis.DTO;



import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Getter
@Setter
public class ProductoDTO {

    private Integer id;

    @NotEmpty // no puede estar vacia, te exige completar la informacion
    @Size(min = 5, max =50, message = " el name deberia tener mas de 4 caracteres")
    private String name;

    private String description;


    private double price;

    private int amount;

    private boolean discount;


}
