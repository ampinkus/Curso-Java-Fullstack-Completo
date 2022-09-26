package com.cursojava.curso.controlers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alfredo");
        usuario.setApellido("Pinkus");
        usuario.setEmail("ampinkus@gmail.com");
        usuario.setTelefono("1144335");
        return usuario;
    }
}
