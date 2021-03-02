package Tankesmedjan.TSWebShop.controller;


import Tankesmedjan.TSWebShop.service.CategoryService;
import Tankesmedjan.TSWebShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Controller
public class startpageController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message", "Hi guest! Welcome to our eminent webshop!");
        model.addAttribute("categories", categoryService.listAllCats());
        model.addAttribute("featuredproducts", productService.listRandomProds());
        model.addAttribute("onsaleproducts", productService.listRandomProds());
        model.addAttribute("topratedproducts", productService.listRandomProds());
        return "index";
    }
}
