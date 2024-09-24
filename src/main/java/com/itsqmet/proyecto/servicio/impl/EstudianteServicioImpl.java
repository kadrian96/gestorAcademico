package com.itsqmet.proyecto.servicio.impl;


import com.itsqmet.proyecto.modelo.Estudiante;

import com.itsqmet.proyecto.repositorio.IEstudianteRepositorio;
import com.itsqmet.proyecto.servicio.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EstudianteServicioImpl implements IEstudianteServicio {

    @Autowired
    private IEstudianteRepositorio estudianteRepositorio;
    @Override
    public void insertarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);

    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepositorio.findAll();
    }

    @Override
    public void eliminarEstudiante(int id) {
        estudianteRepositorio.deleteById(id);
    }

    @Override
    public Optional<Estudiante> listarEstudiante(int id) {
        return estudianteRepositorio.findById(id);
    }
}
