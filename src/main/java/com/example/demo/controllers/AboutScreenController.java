package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutScreenController {
    @GetMapping("/about")
    public String showAbout(){
        return "about";
    }
}
