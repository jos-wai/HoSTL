package upeu.edu.pe.Hostpital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.Hostpital.entity.Historial;

@Repository
public interface HistorialRepository extends JpaRepository<Historial, Long> {
}
