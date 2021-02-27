package Tankesmedjan.TSWebShop.repository;

import Tankesmedjan.TSWebShop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Random;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
