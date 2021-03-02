package Tankesmedjan.TSWebShop.service;


import Tankesmedjan.TSWebShop.entity.ProductEntity;
import Tankesmedjan.TSWebShop.repository.ProductSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSearchService {
    @Autowired
    private ProductSearchRepository repo;

    public List<ProductEntity> listAll(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
    }
}
