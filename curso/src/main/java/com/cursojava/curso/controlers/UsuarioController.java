package com.cursojava.curso.controlers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}") // le agrego al link el id que quiero que tenga el usuario el usuario
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Alfredo");
        usuario.setApellido("Pinkus");
        usuario.setEmail("ampinkus@gmail.com");
        usuario.setTelefono("1144335");
        return usuario;
    }

    @RequestMapping(value = "usuario/editar")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alfredo");
        usuario.setApellido("Pinkus");
        usuario.setEmail("ampinkus@gmail.com");
        usuario.setTelefono("1144335");
        return usuario;
    }

    @RequestMapping(value = "usuario/eliminar")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alfredo");
        usuario.setApellido("Pinkus");
        usuario.setEmail("ampinkus@gmail.com");
        usuario.setTelefono("1144335");
        return usuario;
    }

    @RequestMapping(value = "usuario/buscar")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alfredo");
        usuario.setApellido("Pinkus");
        usuario.setEmail("ampinkus@gmail.com");
        usuario.setTelefono("1144335");
        return usuario;
    }
}
