package com.mx.ids.articulos.service.facturas.detalles;

import com.mx.ids.articulos.dao.facturas.detalles.FacturaDetalleDao;
import com.mx.ids.articulos.domain.facturas.detalles.FacturaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FacturaDetalleServiceImpl implements FacturaDetalleService{

    @Autowired
    private FacturaDetalleDao facturaDetalleDao;

    @Override
    @Transactional(readOnly = true)
    public List<FacturaDetalle> listarFacturaDetalles() {
        return (List<FacturaDetalle>) facturaDetalleDao.findAll();
    }

    @Override
    @Transactional
    public void guardarFacturaDetalle(FacturaDetalle facturaDetalle) {
        facturaDetalleDao.save(facturaDetalle);
    }

    @Override
    public void eliminarFacturaDetalle(FacturaDetalle facturaDetalle) {
        facturaDetalleDao.delete(facturaDetalle);
    }

    @Override
    public FacturaDetalle encontarFacturaDetalle(FacturaDetalle facturaDetalle) {
        return facturaDetalleDao.findById(facturaDetalle.getId()).orElse(null);
    }
}
