package com.Inicio.projeto.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class evento {

    @RequestMapping("/cadastrar")
    public String form(){
        return "evento/evento";
    }
}
