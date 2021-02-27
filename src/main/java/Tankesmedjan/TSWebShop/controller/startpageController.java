package Tankesmedjan.TSWebShop.controller;


import Tankesmedjan.TSWebShop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class startpageController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message", "Hi guest! Welcome to our eminent webshop!");
        model.addAttribute("categories", categoryService.listAllCats());
        return "categories";
    }

}
