package com.tymleaf.customer.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/firstapi")
    public String firstapi(){
        return "home";
    }

}
