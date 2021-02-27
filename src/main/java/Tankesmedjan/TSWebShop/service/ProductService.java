package Tankesmedjan.TSWebShop.service;

import Tankesmedjan.TSWebShop.entity.CategoryEntity;
import Tankesmedjan.TSWebShop.entity.ProductEntity;
import Tankesmedjan.TSWebShop.repository.CategoryRepository;
import Tankesmedjan.TSWebShop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<ProductEntity> listAllProds() {return productRepository.findAll();}
    public ProductEntity getProduct(Integer id) {
        return productRepository.findById(id).get();
    }
    public List<ProductEntity> listRandomProds() {
        List<ProductEntity> productList = new ArrayList<>();
        for(int i=0;i<5;i++) {
            Random rnd = new Random();
            int randomInt = rnd.nextInt(5) + 1;
            productList.add(getProduct(randomInt));
        }

        return productList;
    }
}
