package upeu.edu.pe.Hostpital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.Hostpital.entity.Habitaciones;
import upeu.edu.pe.Hostpital.service.HabitacionesService;

@Controller
@RequestMapping("/habitaciones")
public class HabitacionesController {

    @Autowired
    private HabitacionesService habitacionesService;

    @GetMapping("/")
    public String listarHabitaciones(Model model) {
        model.addAttribute("listaHabitaciones", habitacionesService.listarTodas());
        return "habitaciones/lista_habitaciones";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("habitacion", new Habitaciones());
        return "habitaciones/nuevo_habitaciones";
    }

    @PostMapping("/guardar")
    public String guardarHabitacion(@ModelAttribute("habitacion") Habitaciones habitacion) {
        habitacionesService.guardar(habitacion);
        return "redirect:/habitaciones/";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Habitaciones habitacion = habitacionesService.obtenerPorId(id);
        model.addAttribute("habitacion", habitacion);
        return "habitaciones/editar_habitaciones";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarHabitacion(@PathVariable Long id) {
        habitacionesService.eliminar(id);
        return "redirect:/habitaciones/";
    }
}
