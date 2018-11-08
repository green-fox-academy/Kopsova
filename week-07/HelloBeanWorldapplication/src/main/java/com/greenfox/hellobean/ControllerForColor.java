package com.greenfox.hellobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerForColor {
    @Autowired
    UtilityService colors;


    @RequestMapping(value = "/useful/colored")
    public String randomColor(Model model) {
        model.addAttribute("colo", colors.randomColor());
        return "colored";
    }

    @RequestMapping(value = "/useful")
    public String web() {
        return "Useful";
    }

    @RequestMapping(value = "/useful/email")
    public String email(@RequestParam String email, Model model) {
        String emailColor = "test";
        String emailMessage = "test";
        if (colors.validateEmail(email)) {
            emailColor = "green";
            emailMessage = " is a valid email address.";
        } else {
            emailColor = "red";
            emailMessage = " is not a valid email address.";
        }

        model.addAttribute("validEmail", colors.validateEmail(email));

        model.addAttribute("email", email);
        model.addAttribute("emailColor", emailColor);
        model.addAttribute("emailMessage", emailMessage);

        return "email";
    }

    @RequestMapping(value = "/useful/coding2")
    public String encoding() {
        return "coding";
    }
    @RequestMapping(value = "/useful/coding")
    public String encoding(@RequestParam String cesarText, int cesarNo, Model model) {
        model.addAttribute("text", colors.caesar(cesarText, cesarNo));

        return "coding";
    }
}
