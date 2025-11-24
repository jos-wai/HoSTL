package upeu.edu.pe.Hostpital.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "historiales")
@Data
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombrePaciente;

    @Column(nullable = false)
    private String dniPaciente;

    @Column(nullable = false)
    private LocalDate fechaConsulta;

    @Column(nullable = false)
    private String doctorTratante;

    @Column(nullable = false)
    private String diagnostico;

    @Column(columnDefinition = "TEXT")
    private String sintomas;

    @Column(columnDefinition = "TEXT")
    private String tratamiento;

    @Column(columnDefinition = "TEXT")
    private String medicamentos;

    @Column(nullable = false)
    private String tipoConsulta;

    @Column(columnDefinition = "TEXT")
    private String observaciones;
}
