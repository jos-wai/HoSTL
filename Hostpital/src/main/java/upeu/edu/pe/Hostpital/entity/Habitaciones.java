package upeu.edu.pe.Hostpital.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "habitaciones")
@Data
public class Habitaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numeroHabitacion;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String piso;

    @Column(nullable = false)
    private String estado;

    private String pacienteAsignado;

    private LocalDate fechaAsignacion;

    @Column(nullable = false)
    private Integer capacidad;

    @Column(nullable = false)
    private Double precioNoche;

    @Column(columnDefinition = "TEXT")
    private String equipamiento;

    @Column(columnDefinition = "TEXT")
    private String observaciones;
}
