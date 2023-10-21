package com.forms.forms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
    
    @RequestMapping("/")
    public String mario() {
        return "index";
    }
    
    @RequestMapping("/login.html")
    public String login(@ModelAttribute("frm") Forms frm) {
        return "login";
    }
    
    @RequestMapping("/registersucc")
    public String registersucc(@ModelAttribute("frm") Forms frm) {
        return "registration_succ";
    }
}
