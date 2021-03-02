package Tankesmedjan.TSWebShop.controller;

import Tankesmedjan.TSWebShop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TSErrorController implements ErrorController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/error")
    public String errorHandler(Model model) {
        model.addAttribute("categories", categoryService.listAllCats());
        model.addAttribute("message", "ERROR 404 These are not the droids you're looking for...");
        return "index";
    }
    @Override
    public String getErrorPath() {
        return null;
    }
}
