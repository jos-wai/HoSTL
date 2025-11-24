package upeu.edu.pe.Hostpital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Hostpital.entity.Habitaciones;
import upeu.edu.pe.Hostpital.repository.HabitacionesRepository;

import java.util.List;

@Service
public class HabitacionesService {

    @Autowired
    private HabitacionesRepository habitacionesRepository;

    public List<Habitaciones> listarTodas() {
        return habitacionesRepository.findAll();
    }

    public Habitaciones guardar(Habitaciones habitacion) {
        return habitacionesRepository.save(habitacion);
    }

    public Habitaciones obtenerPorId(Long id) {
        return habitacionesRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        habitacionesRepository.deleteById(id);
    }
}
