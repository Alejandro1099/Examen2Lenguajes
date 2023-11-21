package hn.unah.examen2.servicios;

import java.util.List;
import hn.unah.examen2.modelos.Cliente;

public interface ClienteService {
    
    //crear cliente 
    public Cliente crearCliente(Cliente nvoCliente);

    //obtener todos los cliente
    public List<Cliente> obtenerTodosClientes();

    //obtener cliente x id
    public int obtenerClientexId(int idCliente);
}
