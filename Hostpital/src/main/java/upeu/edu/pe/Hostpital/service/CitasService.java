package upeu.edu.pe.Hostpital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Hostpital.entity.Citas;
import upeu.edu.pe.Hostpital.repository.CitasRepository;

import java.util.List;

@Service
public class CitasService {

    @Autowired
    private CitasRepository citasRepository;

    public List<Citas> listarTodas() {
        return citasRepository.findAll();
    }

    public Citas guardar(Citas cita) {
        return citasRepository.save(cita);
    }

    public Citas obtenerPorId(Long id) {
        return citasRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        citasRepository.deleteById(id);
    }
}
