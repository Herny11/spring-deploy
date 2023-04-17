package com.example.springdeploy;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controlador Rest
@RestController
public class HelloController {

    @Value("${app.var}")
    String message;

    @GetMapping("/hola")

    public String holaMundo(){
        System.out.println(message);
        return "Hola Mundo que tal vamos";
    }


}
