package com.mx.ids.articulos.service.articulos.ropa;

import com.mx.ids.articulos.dao.articulos.ropa.RopaDao;
import com.mx.ids.articulos.domain.articulos.ropa.Ropa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RopaServiceImpl implements RopaService{
    @Autowired
    private RopaDao ropaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Ropa> listarRopa() {
        return (List<Ropa>) ropaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Ropa ropa) {
        ropaDao.save(ropa);
    }

    @Override
    public void eliminar(Ropa ropa) {
        ropaDao.delete(ropa);
    }

    @Override
    public Ropa encontrarArticuloRopa(Long id) {
        return ropaDao.findById(id).orElse(null);
    }

    @Override
    public List<Long> listarRopaId() {
        return ropaDao.findAllById();
    }
}
