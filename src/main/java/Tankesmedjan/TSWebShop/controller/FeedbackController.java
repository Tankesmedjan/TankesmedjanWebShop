package Tankesmedjan.TSWebShop.controller;

import Tankesmedjan.TSWebShop.entity.FeedbackEntity;
import Tankesmedjan.TSWebShop.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping(path = "/contact", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String addFeedback(FeedbackEntity feedbackEntity, Model model) throws Exception{
        feedbackRepository.save(feedbackEntity);
        model.addAttribute("thankyoumessage", "<b>Thank you for your feedback!</b><br/>We will get back to you as soon as possible!");
        return "contact";
    }
}
