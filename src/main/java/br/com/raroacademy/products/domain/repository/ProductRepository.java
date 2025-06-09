package br.com.raroacademy.products.domain.repository;

import br.com.raroacademy.products.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
