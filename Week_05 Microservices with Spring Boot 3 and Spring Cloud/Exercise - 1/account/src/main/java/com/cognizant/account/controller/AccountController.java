package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccountByNumber(@PathVariable String number) {
        // Dummy account details
        return new Account(number, "John Doe", "SAVINGS", 234343);
    }

    static class Account {
        private String number;
        private String name;
        private String type;
        private double balance;

        public Account(String number, String name, String type, double balance) {
            this.number = number;
            this.name = name;
            this.type = type;
            this.balance = balance;
        }

        public String getNumber() { return number; }
        public String getName() { return name; }
        public String getType() { return type; }
        public double getBalance() { return balance; }
    }
}
