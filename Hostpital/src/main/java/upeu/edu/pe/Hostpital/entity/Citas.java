package upeu.edu.pe.Hostpital.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "citas")
@Data
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombrePaciente;

    @Column(nullable = false)
    private String nombreDoctor;

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    @Column(nullable = false)
    private String especialidad;

    @Column(nullable = false)
    private String motivo;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String telefono;

    @Column(columnDefinition = "TEXT")
    private String observaciones;
}
