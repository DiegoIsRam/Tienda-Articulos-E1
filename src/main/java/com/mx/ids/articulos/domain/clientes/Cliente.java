package com.mx.ids.articulos.domain.clientes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String email;
    private String telefono;
    @Column(name="tipodocumento")
    private String tipoDocumento;
    @Column(name="numerodocumento")
    private String numeroDocumento;
}
