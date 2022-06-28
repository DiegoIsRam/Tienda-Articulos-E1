package com.mx.ids.articulos.service.facturas.detalles;

import com.mx.ids.articulos.domain.facturas.detalles.FacturaDetalle;

import java.util.List;

public interface FacturaDetalleService {
    List<FacturaDetalle> listarFacturaDetalles();
    void guardarFacturaDetalle(FacturaDetalle facturaDetalle);
    void eliminarFacturaDetalle(FacturaDetalle facturaDetalle);
    FacturaDetalle encontarFacturaDetalle(FacturaDetalle facturaDetalle);
}
