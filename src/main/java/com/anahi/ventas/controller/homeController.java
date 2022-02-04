package com.anahi.ventas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
    @GetMapping(value = "/")
    public String homeMain()
    {
        return "Home";     
    }
    
    @GetMapping(value = "/home")
    public String homeAlternative() {

        return "HOME 1";
    }
}
