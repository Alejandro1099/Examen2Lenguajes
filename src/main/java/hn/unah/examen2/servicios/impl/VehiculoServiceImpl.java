package hn.unah.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.Vehiculos;
import hn.unah.examen2.repositorios.VehiculoRepository;
import hn.unah.examen2.servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculos crearVehiculos(Vehiculos nvoVehiculo) {
        return this.vehiculoRepository.save(nvoVehiculo);
    }

    @Override
    public List<Vehiculos> obtenerTodosVehiculos() {
        return this.vehiculoRepository.findAll();    
    }

    @Override
    public int obtenerVehiculosxId(int idVehiculos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVehiculosxId'");
    }
    
}
