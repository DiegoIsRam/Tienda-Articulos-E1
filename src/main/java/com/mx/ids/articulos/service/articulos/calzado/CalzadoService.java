package com.mx.ids.articulos.service.articulos.calzado;

import com.mx.ids.articulos.domain.articulos.accesorios.Accesorio;
import com.mx.ids.articulos.domain.articulos.calzado.Calzado;

import java.util.List;

public interface CalzadoService {
    List<Calzado> listarCalzado();
    void guardar(Calzado calzado);
    void eliminar(Calzado calzado);
    Calzado encontrarArticuloCalzado(Calzado calzado);
}
