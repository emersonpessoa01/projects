package br.com.raroacademy.products.domain.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.math.BigDecimal;

public record ProductDTO(

        Long id,
        @NotBlank(message = "O nome do produto é obrigatório")
        String name,
        @Min(1)
        BigDecimal price,
        Boolean status
) {
}
