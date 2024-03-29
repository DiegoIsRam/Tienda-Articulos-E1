package com.mx.ids.articulos.security.entity;

import com.mx.ids.articulos.security.enums.RolNombre;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//CLase para guardar el tipo de roles que habra en nuestra aplicacion
@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @NotNull
    //Se indica que va a ser un Enum de tipo String
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol() {
    }

    public Rol(@NotNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
}