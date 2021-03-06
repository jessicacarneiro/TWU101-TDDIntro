package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private double balance;

    public Account() {

    }

    public Account(double value) {
        this.balance = value;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double value) {
        if (value > this.getBalance()) {
            throw new IllegalArgumentException();
        }

        this.balance -= value;
    }
}
