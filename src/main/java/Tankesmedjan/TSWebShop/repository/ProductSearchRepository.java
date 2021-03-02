package Tankesmedjan.TSWebShop.repository;

import Tankesmedjan.TSWebShop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductSearchRepository extends JpaRepository<ProductEntity, Integer> {
    @Query("SELECT p FROM ProductEntity p WHERE p.productName LIKE %?1%")
    public List<ProductEntity> search(String keyword);
}
