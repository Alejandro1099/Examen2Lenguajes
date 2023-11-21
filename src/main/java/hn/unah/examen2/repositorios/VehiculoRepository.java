package hn.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen2.modelos.Vehiculos;


public interface VehiculoRepository extends JpaRepository<Vehiculos, Integer> {
    
}
