
package com.example.demo;

public class Transaction {
    private double amount;
    private int time;
    private double[] features; // Array for V1, V2, ..., V28

    // Constructor, getters, and setters
    public Transaction(double amount, int time, double[] features) {
        this.amount = amount;
        this.time = time;
        this.features = features;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double[] getFeatures() {
        return features;
    }

    public void setFeatures(double[] features) {
        this.features = features;
    }
}
