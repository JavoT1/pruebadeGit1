package com.example._stWeb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyHomeController {
    @GetMapping("/")
    public String index() {
        return "Esta es Mi Primera Web";
    }
    @GetMapping("/api")
    public String otro() {
        return "Esta es Mi Segunda Web";
    }
    @GetMapping("/api/valor")
    public String valor(@RequestParam int num1) {
        return "El valor ingresado es " + num1;
    }
    @GetMapping("/api/v2")
    public String otrov2() {
        return "Esta es Otra V2";
    }
}
