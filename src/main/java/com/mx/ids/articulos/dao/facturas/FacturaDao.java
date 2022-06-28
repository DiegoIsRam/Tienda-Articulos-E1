package com.mx.ids.articulos.dao.facturas;

import com.mx.ids.articulos.domain.facturas.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaDao extends CrudRepository<Factura,Long> {
}
