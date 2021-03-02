package Tankesmedjan.TSWebShop.controller;

import Tankesmedjan.TSWebShop.entity.ProductEntity;
import Tankesmedjan.TSWebShop.service.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {
    @Autowired
    private ProductSearchService service;

    @RequestMapping("/search")
    public Model viewHomePage(Model model, @Param("keyword") String keyword) {
        List<ProductEntity> listProducts = service.listAll(keyword);
        model.addAttribute("searchResult", listProducts);
        model.addAttribute("keyword", keyword);

        return model;
    }
}
