package upeu.edu.pe.Hostpital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Hostpital.entity.Historial;
import upeu.edu.pe.Hostpital.repository.HistorialRepository;

import java.util.List;

@Service
public class HistorialService {

    @Autowired
    private HistorialRepository historialRepository;

    public List<Historial> listarTodos() {
        return historialRepository.findAll();
    }

    public Historial guardar(Historial historial) {
        return historialRepository.save(historial);
    }

    public Historial obtenerPorId(Long id) {
        return historialRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        historialRepository.deleteById(id);
    }
}
