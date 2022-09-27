package com.cursojava.curso.controlers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(value = "usuarios") // retorno todos los usuarios
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Alfredo");
        usuario.setApellido("Pinkus");
        usuario.setEmail("ampinkus@gmail.com");
        usuario.setTelefono("1144335");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Osvaldo");
        usuario2.setApellido("Potente");
        usuario2.setEmail("opotente@gmail.com");
        usuario2.setTelefono("11777777");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Josefa");
        usuario3.setApellido("Diaz");
        usuario3.setEmail("Josefa@gmail.com");
        usuario3.setTelefono("116666");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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
