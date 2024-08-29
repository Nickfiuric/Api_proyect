package com.apiAlex.primeraApi.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class prueba {
@GetMapping("/hola")
    public String hola(){
    return "HolaMundo";
}
}
