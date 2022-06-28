package com.mx.ids.articulos.service.articulos.accesorios;

import com.mx.ids.articulos.domain.articulos.accesorios.Accesorio;

import java.util.List;

public interface AccesorioService {
    List<Accesorio> listarArticulosAccesorios();
    void guardar(Accesorio accesorio);
    void eliminar(Accesorio accesorio);
    Accesorio encontrarArticuloAccesorios(Accesorio accesorio);
}

