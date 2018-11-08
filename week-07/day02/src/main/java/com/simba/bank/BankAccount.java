package com.simba.bank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    String name;
    double balance;
    String animalType;
    String currency;

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return currency;
    }

    public BankAccount() {
    }


    public BankAccount(String name, double balance, String animalType, String currency) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
    }

    List <BankAccount> animalAccounts = new ArrayList<BankAccount>();



}
