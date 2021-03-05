package Tankesmedjan.TSWebShop.controller;

import Tankesmedjan.TSWebShop.service.CategoryService;
import Tankesmedjan.TSWebShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping("")
    public Model listCategories(Model model) {
        model.addAttribute("categories", categoryService.listAllCats());
        model.addAttribute("message", "Hi guest! Welcome to our eminent webshop!");
        return model;
    }

    @GetMapping("/{id}")
    public String get(@PathVariable Integer id, Model model) {
        model.addAttribute("categories", categoryService.listAllCats());
        model.addAttribute("category", categoryService.getCategory(id).getCategoryName());
        model.addAttribute("products", productService.listAllProdsFromCat(id));
        return "category";
    }

}
