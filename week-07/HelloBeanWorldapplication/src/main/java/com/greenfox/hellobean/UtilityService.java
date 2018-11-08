package com.greenfox.hellobean;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Random;

@Service

public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public Boolean validateEmail(String email) {
        return (email.contains("@") && (email.contains(".")));
    }

    public String caesar(String text, int number) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result += (char) ((int) text.charAt(i) + number);
        }
        return result;

    }
}


