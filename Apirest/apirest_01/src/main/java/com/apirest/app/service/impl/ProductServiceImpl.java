package com.apirest.app.service.impl;

import com.apirest.app.entytis.Product;
import com.apirest.app.repository.ProductRepository;
import com.apirest.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository repository;

    @Override
    public Product crearProducto(Product product) {
     //creando nuevo objeto
        Product productoNew = new Product();
        //guardando en el nuevo objeto

        productoNew.setName(product.getName());
        productoNew.setDescription(product.getDescription());
        productoNew.setPrice(product.getPrice());
        productoNew.setAmount(product.getAmount());
        productoNew.setDiscount(product.isDiscount());


        return repository.save(productoNew);
    }
}
