package Tankesmedjan.TSWebShop.service;

import Tankesmedjan.TSWebShop.entity.CategoryEntity;
import Tankesmedjan.TSWebShop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<CategoryEntity> listAllCats() {return categoryRepository.findAll();}
}
