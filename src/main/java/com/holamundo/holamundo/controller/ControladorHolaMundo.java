package com.holamundo.holamundo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorHolaMundo {
    @RequestMapping("/")
    @ResponseBody

    String home() {
        return "Hola mundo desde Spring Boot para el materia de ambientes de programacion avanzada";
    }
}





