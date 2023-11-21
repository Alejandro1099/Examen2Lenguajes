package hn.unah.examen2.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reserva")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    
    @Id
    @Column(name = "idReserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;
    
    private int idCliente;

    private int idVehiculo;

    private Date fecha;

    private int dias;

    private int total;
}
