package Tankesmedjan.TSWebShop.controller;

import Tankesmedjan.TSWebShop.entity.CategoryEntity;
import Tankesmedjan.TSWebShop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public List<CategoryEntity> list() {
        return categoryService.listAllCats();
    }
}
