package upeu.edu.pe.Hostpital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.Hostpital.entity.Citas;
import upeu.edu.pe.Hostpital.service.CitasService;
import upeu.edu.pe.Hostpital.service.DoctorService;
import upeu.edu.pe.Hostpital.service.PacienteService;

@Controller
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitasService citasService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/")
    public String listarCitas(Model model) {
        model.addAttribute("listaCitas", citasService.listarTodas());
        return "citas/lista_citas";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("cita", new Citas());
        model.addAttribute("listaPacientes", pacienteService.listarTodos());
        model.addAttribute("listaDoctores", doctorService.listarTodos());
        return "citas/nuevo_citas";
    }

    @PostMapping("/guardar")
    public String guardarCita(@ModelAttribute("cita") Citas cita) {
        citasService.guardar(cita);
        return "redirect:/citas/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Citas cita = citasService.obtenerPorId(id);
        model.addAttribute("cita", cita);
        model.addAttribute("listaPacientes", pacienteService.listarTodos());
        model.addAttribute("listaDoctores", doctorService.listarTodos());
        return "citas/editar_citas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCita(@PathVariable Long id) {
        citasService.eliminar(id);
        return "redirect:/citas/";
    }
}
