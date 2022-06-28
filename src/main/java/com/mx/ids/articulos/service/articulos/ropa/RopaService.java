package com.mx.ids.articulos.service.articulos.ropa;

import com.mx.ids.articulos.domain.articulos.calzado.Calzado;
import com.mx.ids.articulos.domain.articulos.ropa.Ropa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RopaService {
    List<Ropa> listarRopa();
    void guardar(Ropa ropa);
    void eliminar(Ropa ropa);
    Ropa encontrarArticuloRopa(Long id);
    List<Long> listarRopaId();

}
