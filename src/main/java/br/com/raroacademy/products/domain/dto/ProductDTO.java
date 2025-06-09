package br.com.raroacademy.products.domain.dto;

import java.math.BigDecimal;

public record ProductDTO(
        Long id,
        String name,
        BigDecimal price,
        Boolean status
) {

}
