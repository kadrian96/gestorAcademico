package com.itsqmet.proyecto.controlador;

import com.itsqmet.proyecto.modelo.Aula;
import com.itsqmet.proyecto.modelo.Estudiante;
import com.itsqmet.proyecto.servicio.IAulaServicio;
import com.itsqmet.proyecto.servicio.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
@Controller
public class EstudianteControlador {
    @Autowired
    IEstudianteServicio estudianteServicio;
    @GetMapping("/estudiantes")
    public String estudiantesInicio(Model model){
        List<Estudiante> estudiantes=estudianteServicio.listarEstudiantes();
        model.addAttribute("listadoEstudiantes",estudiantes);
        return "Estudiante/listarEstudiante";
    }

    @GetMapping("/nuevoEstudiante")
    public String RegistrarEstudiante(Model model) {
        model.addAttribute("pageTitle","Crear Estudiante");
        model.addAttribute("nuevoEstudiante", new Estudiante());
        return "Estudiante/nuevoEstudiante";
    }


    @PostMapping("/nuevoEstudianteR")
    public String GuardarEstudiante(@ModelAttribute("nuevoEstudiante") Estudiante estudiante, RedirectAttributes redirectAttributes) {
        estudianteServicio.insertarEstudiante(estudiante);
        redirectAttributes.addFlashAttribute("message","El estudiante ha sido guardada con exito");
        return "redirect:/estudiantes";
    }
    @GetMapping("editarEstudiante/{idEstudiante}")
    public String editarEstudiante(@PathVariable int idEstudiante, Model model) {
        Optional<Estudiante> estudianteEdit = estudianteServicio.listarEstudiante(idEstudiante);
        model.addAttribute("pageTitle","Editar Estudiante");
        model.addAttribute("nuevoEstudiante",estudianteEdit);
        return "Estudiante/nuevoEstudiante";
    }


    @GetMapping("/eliminarEstudiante/{idEstudiante}")
    public String eliminarEstudiante(@PathVariable(value = "idEstudiante") int idEstudiante) {
        estudianteServicio.eliminarEstudiante(idEstudiante);
        return "redirect:/estudiantes";
    }
}
