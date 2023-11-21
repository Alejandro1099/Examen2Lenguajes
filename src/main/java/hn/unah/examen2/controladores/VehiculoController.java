package hn.unah.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.Vehiculos;
import hn.unah.examen2.servicios.VehiculoService;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    
    @Autowired
    private VehiculoService vehiculoService;

    @PostMapping("/crear")
    public Vehiculos crearVehiculos(@RequestBody Vehiculos nvoVehiculo){
        return this.vehiculoService.crearVehiculos(nvoVehiculo);
    }

    public List<Vehiculos> obtenerTodosVehiculos(){
        return this.vehiculoService.obtenerTodosVehiculos();
    }
}
