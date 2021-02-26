package Tankesmedjan.TSWebShop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class startpageController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message", "Welcome to Tankesmedjan Webshop");
        return "startpage";
    }

}
