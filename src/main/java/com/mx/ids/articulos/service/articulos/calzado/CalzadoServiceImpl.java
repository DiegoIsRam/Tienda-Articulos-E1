package com.mx.ids.articulos.service.articulos.calzado;

import com.mx.ids.articulos.dao.articulos.calzado.CalzadoDao;
import com.mx.ids.articulos.domain.articulos.calzado.Calzado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CalzadoServiceImpl implements CalzadoService{
    @Autowired
    private CalzadoDao calzadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Calzado> listarCalzado() {
        return (List<Calzado>) calzadoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Calzado calzado) {
        calzadoDao.save(calzado);
    }

    @Override
    @Transactional
    public void eliminar(Calzado calzado) {
        calzadoDao.delete(calzado);
    }

    @Override
    @Transactional(readOnly = true)
    public Calzado encontrarArticuloCalzado(Calzado calzado) {
        return calzadoDao.findById(calzado.getId()).orElse(null);
    }
}
