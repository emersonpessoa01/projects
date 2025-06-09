package br.com.raroacademy.products.service;

import br.com.raroacademy.products.domain.dto.ProductDTO;
import br.com.raroacademy.products.domain.entity.Product;
import br.com.raroacademy.products.domain.repository.ProductRepository;
import br.com.raroacademy.products.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(ProductDTO productDTO) {
        Product product = ProductMapper.toEntity(productDTO);

        // Aqui você pode persistir o produto no banco de dados com o repositório
//        System.out.println(product);
        productRepository.save(product);
    }
}
