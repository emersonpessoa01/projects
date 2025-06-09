package br.com.raroacademy.products.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id // Serve para identificar o campo como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // É utilizado para gerar o valor da chave primária automaticamente
    private Long id;
    private String name;
    private BigDecimal price;
    private Boolean status;
}
