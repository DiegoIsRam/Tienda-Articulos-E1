package com.mx.ids.articulos.service.clientes;

import com.mx.ids.articulos.domain.articulos.Articulo;
import com.mx.ids.articulos.domain.clientes.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClienteService {
    List<Cliente> listarClientes();
    void guardar(Cliente cliente);
    void eliminar(Cliente cliente);
    Cliente encontrarCliente(Cliente cliente);
}

