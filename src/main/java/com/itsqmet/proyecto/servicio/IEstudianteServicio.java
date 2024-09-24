package com.itsqmet.proyecto.servicio;


import com.itsqmet.proyecto.modelo.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IEstudianteServicio {
    public void insertarEstudiante(Estudiante estudiante);
    public void actualizarEstudiante(Estudiante estudiante);
    public List<Estudiante> listarEstudiantes();
    public void eliminarEstudiante(int id);
    public Optional<Estudiante> listarEstudiante(int id);
}
