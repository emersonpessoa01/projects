package br.com.raroacademy.products.controllers;

import br.com.raroacademy.products.domain.dto.ProductDTO;
import br.com.raroacademy.products.domain.entity.Product;
import br.com.raroacademy.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping()
    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO) {
        // Chama o serviço para criar o produto
        productService.createProduct(productDTO);

        // Aqui você pode adicionar lógica adicional, como retornar uma resposta ou realizar outras operações
        // Por exemplo, retornar um status HTTP 201 Created
         return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
