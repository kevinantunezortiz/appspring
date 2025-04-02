package com.example.app1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String nombre;
   private String email;
   private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, int edad,String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email=email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
