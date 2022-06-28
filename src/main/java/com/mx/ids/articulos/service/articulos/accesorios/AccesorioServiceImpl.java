package com.mx.ids.articulos.service.articulos.accesorios;

import com.mx.ids.articulos.dao.articulos.accesorios.AccesorioDao;
import com.mx.ids.articulos.domain.articulos.accesorios.Accesorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AccesorioServiceImpl implements AccesorioService {

    @Autowired
    private AccesorioDao accesorioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Accesorio> listarArticulosAccesorios() {
        return (List<Accesorio>) accesorioDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Accesorio accesorio) {
        accesorioDao.save(accesorio);
    }

    @Override
    @Transactional
    public void eliminar(Accesorio accesorio) {
        accesorioDao.delete(accesorio);
    }

    @Override
    @Transactional(readOnly = true)
    public Accesorio encontrarArticuloAccesorios(Accesorio accesorio) {
        return accesorioDao.findById(accesorio.getId()).orElse(null);
    }
}
