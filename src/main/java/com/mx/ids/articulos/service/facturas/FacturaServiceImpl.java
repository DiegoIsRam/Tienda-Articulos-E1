package com.mx.ids.articulos.service.facturas;

import com.mx.ids.articulos.dao.facturas.FacturaDao;
import com.mx.ids.articulos.domain.facturas.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService{
    @Autowired
    private FacturaDao facturaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Factura> listarFacturas() {
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    @Transactional
    public void guardarFactura(Factura factura) {
        facturaDao.save(factura);
    }

    @Override
    @Transactional
    public void eliminarFactura(Factura factura) {
        facturaDao.delete(factura);
    }

    @Override
    @Transactional(readOnly = true)
    public Factura encontarFactura(Factura factura) {
        return facturaDao.findById(factura.getId()).orElse(null);
    }
}
