package com.mx.ids.articulos.service.articulos;

import com.mx.ids.articulos.dao.articulos.ArticuloDao;
import com.mx.ids.articulos.domain.articulos.Articulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticulosServiceImpl implements ArticulosService{
    @Autowired
    private ArticuloDao articuloDao;

    @Override
    @Transactional(readOnly = true)
    public List<Articulo> listarArticulos() {
        return (List<Articulo>) articuloDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Articulo articulo) {
        articuloDao.save(articulo);
    }

    @Override
    @Transactional
    public void eliminar(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    @Transactional(readOnly = true)
    public Articulo encontrarArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getId()).orElse(null);
    }
}
