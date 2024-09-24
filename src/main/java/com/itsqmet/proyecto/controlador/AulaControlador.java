package com.itsqmet.proyecto.controlador;

import com.itsqmet.proyecto.modelo.Aula;
import com.itsqmet.proyecto.servicio.IAulaServicio;
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
public class AulaControlador {
    @Autowired
    IAulaServicio aulaServicio;
    @GetMapping("/aulas")
    public String aulasInicio(Model model){
        List<Aula> aulas=aulaServicio.listarAulas();
        model.addAttribute("listadoAulas",aulas);
        return "Aula/listarAula";
    }

    @GetMapping("/nuevaAula")
    public String RegistrarAula(Model model) {
        model.addAttribute("pageTitle","Crear Aula");
        model.addAttribute("nuevoAula", new Aula());
        return "Aula/nuevaAula";
    }


    @PostMapping("/nuevaAulaR")
    public String GuardarAula(@ModelAttribute("nuevoAula") Aula aula, RedirectAttributes redirectAttributes) {
        aulaServicio.insertarAula(aula);
        redirectAttributes.addFlashAttribute("message","El aula ha sido guardada con exito");
        return "redirect:/aulas";
    }
    @GetMapping("editarAula/{idAula}")
        public String editarAula(@PathVariable int idAula, Model model) {
        Optional<Aula> aulaEdit = aulaServicio.listarAula(idAula);
        model.addAttribute("pageTitle","Editar Aula");
        model.addAttribute("nuevoAula",aulaEdit);
        return "Aula/nuevaAula";
    }


    @GetMapping("/eliminarAula/{idAula}")
    public String eliminarAula(@PathVariable(value = "idAula") int idAula) {
        aulaServicio.eliminarAula(idAula);
        return "redirect:/aulas";
    }

}
