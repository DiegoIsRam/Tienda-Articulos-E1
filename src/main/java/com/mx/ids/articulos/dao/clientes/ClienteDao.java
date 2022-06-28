package com.mx.ids.articulos.dao.clientes;

import com.mx.ids.articulos.domain.clientes.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente,Long> {
}
