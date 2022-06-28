package com.mx.ids.articulos.service.articulos;

import com.mx.ids.articulos.domain.articulos.Articulo;

import java.util.List;

public interface ArticulosService{
    List<Articulo> listarArticulos();
    void guardar(Articulo articulo);
    void eliminar(Articulo articulo);
    Articulo encontrarArticulo(Articulo articulo);
}
