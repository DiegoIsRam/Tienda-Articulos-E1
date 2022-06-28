package com.mx.ids.articulos.domain.facturas;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="idcliente")
    private Long idCliente;
    @Column(name="idarticulo")
    private Long idArticulo;
    private double precio;
    private Long cantidad;
}
