package Tankesmedjan.TSWebShop.controller;


import Tankesmedjan.TSWebShop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/contact")
    public Model contact (Model model) {
        model.addAttribute("categories", categoryService.listAllCats());
        return model;
    }
}
