package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class FraudDetectionService {

    public String detectFraud(Transaction transaction) {
        // Simulate prediction logic
        double threshold = 500.0; // Example threshold for fraud detection
        if (transaction.getAmount() > threshold) {
            return "Fraudulent";
        } else {
            return "Non-Fraudulent";
        }
    }
}
