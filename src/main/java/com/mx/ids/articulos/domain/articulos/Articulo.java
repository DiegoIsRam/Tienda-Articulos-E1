package com.mx.ids.articulos.domain.articulos;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="articulos")
public class Articulo implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoria;
    private String descripcion;
    private  double precio;
    private Long stock;
    @Column(name="stockminimo")
    private Long stockMinimo;
    @Column(name="stockmaximo")
    private Long stockMaximo;
    private double costo;


}
