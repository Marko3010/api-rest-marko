package com.apirest.app.controller;


import com.apirest.app.entytis.Product;
import com.apirest.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductoController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product guardarProducto(@RequestBody Product product){
        return service.crearProducto(product);

    }
}
