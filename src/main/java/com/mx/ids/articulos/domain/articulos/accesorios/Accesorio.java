package com.mx.ids.articulos.domain.articulos.accesorios;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="articulos_accesorios_detalles")
public class Accesorio implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="idarticulo")
    private Long idArticulo;
    private String tipo;
    private String color;
}
