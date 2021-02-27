package Tankesmedjan.TSWebShop.controller;

import Tankesmedjan.TSWebShop.entity.CategoryEntity;
import Tankesmedjan.TSWebShop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    @GetMapping("")
    public Model listCategories(Model model) {
        model.addAttribute("categories", categoryService.listAllCats());
        return model;
    }
    public List<CategoryEntity> list() {

        return categoryService.listAllCats();
    }
    @GetMapping("/{id}")
    public ResponseEntity<CategoryEntity> get(@PathVariable Integer id) {
        try {
            CategoryEntity categoryEntity = categoryService.getCategory(id);
            return new ResponseEntity<CategoryEntity>(categoryEntity, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<CategoryEntity>(HttpStatus.NOT_FOUND);
        }
    }

}
