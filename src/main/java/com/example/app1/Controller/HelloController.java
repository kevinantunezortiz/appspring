package com.example.app1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/saludo")
    public String hola(){
        return "hola";
    }

}
