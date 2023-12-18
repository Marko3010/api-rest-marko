package com.apirest.app.controller;


import com.apirest.app.entytis.DTO.ProductoDTO;
import com.apirest.app.entytis.Product;
import com.apirest.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController // tipo res (JSON)
@RequestMapping("/api/product") // es la ruta
public class ProductoController {

    @Autowired
    private ProductService service;

 @PostMapping
    public ResponseEntity<ProductoDTO> guardarProducto(@RequestBody @Valid ProductoDTO productoDTO) {
        return new ResponseEntity<>(service.crearProducto(productoDTO), HttpStatus.CREATED);
        }


    @GetMapping
    public List<ProductoDTO> listarTodo(){
        return service.listarTodosLosProductos();

    }

    @GetMapping("/buscar/{id}")
    public ProductoDTO listarPorId(@PathVariable Integer id){
        return service.BuscarPorId(id);

    }

    @DeleteMapping("/buscar/{id}")
    public void borrar(@PathVariable Integer id){
        service.BorrarId(id);
    }

    @PutMapping("buscar/{id}")
    public Product actualizarProducto(@PathVariable("id") Integer id,@RequestBody Product product){
        return service.actualizarProductoPorId(id, product);
    }

}


