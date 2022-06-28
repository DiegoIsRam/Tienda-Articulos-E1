package com.mx.ids.articulos.domain.facturas.detalles;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="facturas_detalles")
public class FacturaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="idfactura")
    private Long idFactura;
    private String tipo;
    private Long numero;
    @Column(name="fechaemision")
    private Date fechaEmision;
    @Column(name="mediodepago")
    private String medioDePago;
    private String descripcion;
}
