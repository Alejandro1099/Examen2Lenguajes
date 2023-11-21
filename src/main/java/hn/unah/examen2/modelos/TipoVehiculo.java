package hn.unah.examen2.modelos;



import com.fasterxml.jackson.annotation.JsonIgnore;


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
@Table(name = "tipoVehiculo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TipoVehiculo {
    
    @Id
    @Column(name = "idTipoVehiculo")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipovehiculo;

    private String descripcion;

    private double precioXHora;
}
