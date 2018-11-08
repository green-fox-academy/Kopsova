package com.simba.bank.Controllers;

import com.simba.bank.BankAccount;
import com.simba.bank.ListOfAccounts;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.util.List;

@org.springframework.stereotype.Controller

public class Controller1 {


    @RequestMapping(value = "/show")
    public String account(Model model) {

        BankAccount account = new BankAccount("Simba", 2000, "lion", "Zebra");
        DecimalFormat df = new DecimalFormat("0.00");
        String formatedBalance = df.format(account.getBalance());
        model.addAttribute("account", account);
        model.addAttribute("formatedBallance", formatedBalance);

        String myString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        return "show";
    }

    @RequestMapping(value = "/show2")
    public String sentenceEnjoy(Model model) {
        String sentence = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("sentence", sentence);
        return "show";
    }


    List<BankAccount> myListOfAccounts = new ListOfAccounts().getMyList();

    @RequestMapping(value = "/showAnimals")
    public String animal(Model model) {
        model.addAttribute("myListOfAccounts", myListOfAccounts);
        return "showAnimals";
    }


}
