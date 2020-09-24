package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/")
    public String welcome(){
        return "index";
    }

    @PostMapping("/bmicalc")
    public String bmicalc(@RequestParam double weight, @RequestParam double height, Model model) {
        double bmi = weight / (height * height);
        model.addAttribute("bmicalc", bmi);
        return "result";
    }
}
