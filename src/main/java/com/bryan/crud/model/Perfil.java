/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bvaldez
 */
@Entity
@Table(name = "tab_perfil")

public class Perfil implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "n_perfil_pk")
    private Long id;
    
    @Column(name = "c_nombre_perfil")
    private String nombre;
    
    @Column(name = "n_estado")
    private int estado;
    
    @OneToMany(mappedBy = "perfil", fetch = FetchType.EAGER)
    @JsonBackReference
    private Set<User> usuarios;

    public Perfil() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Set<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<User> usuarios) {
        this.usuarios = usuarios;
    }    
    
}
