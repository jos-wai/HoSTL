package upeu.edu.pe.Hostpital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.Hostpital.entity.Historial;
import upeu.edu.pe.Hostpital.service.HistorialService;
import upeu.edu.pe.Hostpital.service.PacienteService;
import upeu.edu.pe.Hostpital.service.DoctorService;

@Controller
@RequestMapping("/historiales")
public class HistorialController {

    @Autowired
    private HistorialService historialService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/")
    public String listarHistoriales(Model model) {
        model.addAttribute("listaHistoriales", historialService.listarTodos());
        return "historial/lista_historial";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("historial", new Historial());
        model.addAttribute("listaPacientes", pacienteService.listarTodos());
        model.addAttribute("listaDoctores", doctorService.listarTodos());
        return "historial/nuevo_historial";
    }

    @PostMapping("/guardar")
    public String guardarHistorial(@ModelAttribute("historial") Historial historial) {
        historialService.guardar(historial);
        return "redirect:/historiales/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Historial historial = historialService.obtenerPorId(id);
        model.addAttribute("historial", historial);
        model.addAttribute("listaPacientes", pacienteService.listarTodos());
        model.addAttribute("listaDoctores", doctorService.listarTodos());
        return "historial/editar_historial";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarHistorial(@PathVariable Long id) {
        historialService.eliminar(id);
        return "redirect:/historiales/";
    }
}
