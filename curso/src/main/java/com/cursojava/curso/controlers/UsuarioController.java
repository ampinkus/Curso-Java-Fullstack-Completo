package com.cursojava.curso.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "prueba")
    public String prueba(){
        return "Si ves la palabra Prueba es que el controlador está funcionando";
    }
}
