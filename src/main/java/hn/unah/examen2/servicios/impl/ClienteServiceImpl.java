package hn.unah.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.Cliente;
import hn.unah.examen2.repositorios.ClienteRepository;
import hn.unah.examen2.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente nvoCliente) {
        return clienteRepository.save(nvoCliente);
    }

    @Override
    public List<Cliente> obtenerTodosClientes() {
        return this.clienteRepository.findAll();
    }

    @Override
    public int obtenerClientexId(int idCliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerClientexId'");
    }
    
}
