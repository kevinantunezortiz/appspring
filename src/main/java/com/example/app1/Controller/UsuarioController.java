package com.example.app1.Controller;

import com.example.app1.Model.Usuario;
import com.example.app1.Repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping
    public List<Usuario> obtenerUsuarios(){
        return usuarioRepository.findAll();
    }
    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable Long id){
        return usuarioRepository.findById(id).orElse(null);
    }
    @PostMapping
    @Transactional
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id,@RequestBody Usuario usuarioActualizado){
        usuarioActualizado.setId(id);
        return usuarioRepository.save(usuarioActualizado);
    }
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }
}
