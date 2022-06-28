package com.mx.ids.articulos.domain.articulos.calzado;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="articulos_calzados_detalles")
public class Calzado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="idarticulo")
    private Long idArticulo;
    private String tipo;
    private String usabilidad;
    private String numero;
    private String color;
}
