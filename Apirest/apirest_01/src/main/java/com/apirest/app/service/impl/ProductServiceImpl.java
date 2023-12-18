package com.apirest.app.service.impl;

import com.apirest.app.entytis.DTO.ProductoDTO;
import com.apirest.app.entytis.Product;
import com.apirest.app.repository.ProductRepository;
import com.apirest.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository repository;

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        // convert from DTO to entity
       Product product = new Product();

       product.setName(productoDTO.getName());
       product.setDescription(productoDTO.getDescription());
       product.setPrice(productoDTO.getPrice());
       product.setAmount(productoDTO.getAmount());
       product.setDiscount(product.isDiscount());

       Product newProduct = repository.save(product);

       //convert entity to DTO
        ProductoDTO productResponse = new ProductoDTO();

        productResponse.setId(newProduct.getId());
        productResponse.setDescription(newProduct.getDescription());
        productResponse.setAmount(newProduct.getAmount());
        productResponse.setName(newProduct.getName());
        productResponse.setPrice(newProduct.getPrice());


       return productResponse;


    }

    @Override
    public List<ProductoDTO> listarTodosLosProductos() {
          List<Product> products =  repository.findAll();
        return products.stream().map(variable -> mapDTO(variable)).collect(Collectors.toList());

    }


    @Override
    public ProductoDTO BuscarPorId(Integer id) {

        Product product = repository.findById(id).orElseThrow(()-> new RuntimeException("erorr"));

        return mapDTO(product);
    }

    @Override
    public void BorrarId(Integer id) {

        System.out.println("Se borro el usuario con id:" + id);
        repository.deleteById(id);
    }

    @Override
    public Product actualizarProductoPorId(Integer id, Product product) {

        Product result = repository.findById(id).orElseThrow( () -> new ResolutionException("objeto de producto no encontrado" + id));

        result.setName(product.getName());
        result.setDescription(product.getDescription());
        result.setPrice(product.getPrice());
        result.setAmount(product.getAmount());
        result.setDiscount(product.isDiscount());
       Product productoNuevo = repository.save(result);
        return productoNuevo;
    }


    ////convert product a ProductDTO

    private ProductoDTO mapDTO(Product product){

        ProductoDTO productResponse = new ProductoDTO();

        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setDescription(product.getDescription());
        productResponse.setPrice(product.getPrice());
        productResponse.setAmount(product.getAmount());
        productResponse.setDiscount(productResponse.isDiscount());

        return productResponse;

    }

}
