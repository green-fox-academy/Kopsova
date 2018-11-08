package com.simba.bank;

import java.util.ArrayList;
import java.util.List;

public class ListOfAccounts extends BankAccount{

    List<BankAccount> myList = new ArrayList<BankAccount>();

    public ListOfAccounts (){
        myList.add(new BankAccount("Simba", 2000, "lion", "Zebra"));
        myList.add(new BankAccount("Mony", 3000, "monkey", "Zebra"));
        myList.add(new BankAccount("Zeb", 4000, "zebra", "Zebra"));
        myList.add(new BankAccount("Ian", 5000, "horse", "Zebra"));
        myList.add(new BankAccount("Fifi", 6000, "cat", "Zebra"));

    }

// nepouzivat
    public ListOfAccounts(List<BankAccount> myList) {
        this.myList = myList;
    }

    public ListOfAccounts(String name, double balance, String animalType, String currency, List<BankAccount> myList) {
        super(name, balance, animalType, currency);
        this.myList = myList;
    }

    public List<BankAccount> getMyList() {
        return myList;
    }
}
