package upeu.edu.pe.Hostpital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.Hostpital.entity.Habitaciones;

@Repository
public interface HabitacionesRepository extends JpaRepository<Habitaciones, Long> {
}
