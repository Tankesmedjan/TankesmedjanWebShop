package Tankesmedjan.TSWebShop.repository;

import Tankesmedjan.TSWebShop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    @Query("SELECT p FROM ProductEntity p WHERE p.categoryId = ?1")
    public List<ProductEntity> listAllInCategory(int id);
}
