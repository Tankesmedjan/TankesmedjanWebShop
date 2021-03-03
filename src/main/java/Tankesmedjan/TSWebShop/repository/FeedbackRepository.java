package Tankesmedjan.TSWebShop.repository;


import Tankesmedjan.TSWebShop.entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Integer> {
}
