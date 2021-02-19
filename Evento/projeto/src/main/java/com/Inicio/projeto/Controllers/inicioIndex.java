package com.Inicio.projeto.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class inicioIndex {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
