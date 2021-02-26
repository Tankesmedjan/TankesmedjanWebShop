package Tankesmedjan.TSWebShop.repository;

import Tankesmedjan.TSWebShop.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
