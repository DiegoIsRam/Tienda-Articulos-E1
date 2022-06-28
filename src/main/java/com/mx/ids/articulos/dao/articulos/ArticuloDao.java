package com.mx.ids.articulos.dao.articulos;

import com.mx.ids.articulos.domain.articulos.Articulo;
import org.springframework.data.repository.CrudRepository;

public interface ArticuloDao extends CrudRepository<Articulo,Long> {
}
