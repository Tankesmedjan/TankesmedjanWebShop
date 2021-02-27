package Tankesmedjan.TSWebShop.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TSErrorController implements ErrorController {
    @RequestMapping("/error")
    public String errorHandler(Model model) {
        model.addAttribute("message", "These are not the droids you're looking for...");
        return "startpage";
    }
    @Override
    public String getErrorPath() {
        return null;
    }
}
