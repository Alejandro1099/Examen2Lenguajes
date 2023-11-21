package hn.unah.examen2.servicios;

import java.util.List;
import hn.unah.examen2.modelos.Vehiculos;

public interface VehiculoService {
    
    //crear vehiculo
    public Vehiculos crearVehiculos(Vehiculos nvoVehiculo);

    //obtener todos los vehiculos
    public List<Vehiculos> obtenerTodosVehiculos();

    //obtener vehiculo x id
    public int obtenerVehiculosxId(int idVehiculos);
}
