package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FraudController {

    @Autowired
    private FraudDetectionService fraudDetectionService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/predict")
    public String predictFraud(
            @RequestParam("amount") double amount,
            @RequestParam("time") int time,
            @RequestParam("features") double[] features,
            Model model) {
        
        // Create Transaction object
        Transaction transaction = new Transaction(amount, time, features);

        // Predict fraud
        String result = fraudDetectionService.detectFraud(transaction);
        
        model.addAttribute("prediction", result);
        return "index";
    }
}
