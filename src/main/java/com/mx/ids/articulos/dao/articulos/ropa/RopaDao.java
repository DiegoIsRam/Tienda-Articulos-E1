package com.mx.ids.articulos.dao.articulos.ropa;

import com.mx.ids.articulos.domain.articulos.ropa.Ropa;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RopaDao extends CrudRepository<Ropa,Long> {
    @Query (nativeQuery = true, value = "SELECT id FROM articulos_ropa_detalles")
    List<Long> findAllById();
}

