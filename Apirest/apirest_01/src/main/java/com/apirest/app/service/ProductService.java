package com.apirest.app.service;


import com.apirest.app.entytis.DTO.ProductoDTO;
import com.apirest.app.entytis.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public ProductoDTO crearProducto(ProductoDTO productoDTO);

    public List<Product> listarTodosLosProductos();

     public Optional<Product> BuscarPorId(Integer id);

     public void BorrarId(Integer id);

     public Product actualizarProductoPorId(Integer id, Product product);



}
