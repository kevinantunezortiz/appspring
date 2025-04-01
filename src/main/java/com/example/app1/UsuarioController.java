package com.example.app1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private List<Usuario> listaUsuarios = new ArrayList<>();

    @GetMapping
    public List<Usuario> obtenerUsuarios(){
        return listaUsuarios;
    }
    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable Long id){
        return listaUsuarios.stream()
                .filter(usuario -> usuario.getId().equals(id))
                .findFirst().orElse(null);
    }
    @PostMapping
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
        listaUsuarios.add(usuario);
        return usuario;
    }
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id,@RequestBody Usuario usuario){
        for (int i = 0; i < listaUsuarios.size() ; i++) {
            if(listaUsuarios.get(i).getId().equals(id)){
                listaUsuarios.set(i,usuario);
                return usuario;
            }
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        listaUsuarios.removeIf(usuario->usuario.getId().equals(id));
    }
}
