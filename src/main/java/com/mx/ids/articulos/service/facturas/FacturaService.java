package com.mx.ids.articulos.service.facturas;

import com.mx.ids.articulos.domain.facturas.Factura;

import java.util.List;

public interface FacturaService {
    List<Factura> listarFacturas();
    void guardarFactura(Factura factura);
    void eliminarFactura(Factura factura);
    Factura encontarFactura(Factura factura);
}
