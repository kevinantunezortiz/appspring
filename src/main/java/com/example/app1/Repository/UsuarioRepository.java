package com.example.app1.Repository;

import com.example.app1.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
