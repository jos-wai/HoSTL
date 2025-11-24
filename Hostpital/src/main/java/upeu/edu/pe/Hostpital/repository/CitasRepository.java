package upeu.edu.pe.Hostpital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upeu.edu.pe.Hostpital.entity.Citas;

@Repository
public interface CitasRepository extends JpaRepository<Citas, Long> {
}
