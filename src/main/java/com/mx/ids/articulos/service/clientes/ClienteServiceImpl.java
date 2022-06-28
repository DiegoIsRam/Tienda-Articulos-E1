package com.mx.ids.articulos.service.clientes;

import com.mx.ids.articulos.dao.clientes.ClienteDao;
import com.mx.ids.articulos.domain.clientes.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteDao clienteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listarClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void eliminar(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public Cliente encontrarCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getId()).orElse(null);
    }
}
