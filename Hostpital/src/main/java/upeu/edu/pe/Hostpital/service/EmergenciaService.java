package upeu.edu.pe.Hostpital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Hostpital.entity.Emergencia;
import upeu.edu.pe.Hostpital.repository.EmergenciaRepository;

import java.util.List;

@Service
public class EmergenciaService {

    @Autowired
    private EmergenciaRepository emergenciaRepository;

    public List<Emergencia> listarTodas() {
        return emergenciaRepository.findAll();
    }

    public Emergencia guardar(Emergencia emergencia) {
        return emergenciaRepository.save(emergencia);
    }

    public Emergencia obtenerPorId(Long id) {
        return emergenciaRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        emergenciaRepository.deleteById(id);
    }
}
