package br.com.raroacademy.products.domain.entity;

import br.com.raroacademy.products.domain.dto.ProductDTO;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
    private Boolean status;

    public Product toProduct(ProductDTO productDTO) {
        return new Product(
                productDTO.id(),
                productDTO.name(),
                productDTO.price(),
                productDTO.status()
        );
    }
}
