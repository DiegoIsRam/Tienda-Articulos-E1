package com.mx.ids.articulos.domain.articulos.ropa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="articulos_ropa_detalles")
public class Ropa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="idarticulo")
    private Long idArticulo;
    private String tipo;
    private String usabilidad;
    private String talle;
    private String temporada;
    private String color;

}
