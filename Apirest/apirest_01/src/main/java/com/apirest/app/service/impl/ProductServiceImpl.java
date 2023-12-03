package com.apirest.app.service.impl;

import com.apirest.app.entytis.Product;
import com.apirest.app.repository.ProductRepository;
import com.apirest.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Product> listarTodosLosProductos() {
        return repository.findAll();
    }



    @Override
    public Optional<Product> BuscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void BorrarId(Integer id) {

        System.out.println("Se borro el usuario con id:" + id);
        repository.deleteById(id);
    }


}
