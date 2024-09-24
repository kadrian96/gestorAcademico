package com.itsqmet.proyecto.servicio.impl;

import com.itsqmet.proyecto.modelo.Profesor;

import com.itsqmet.proyecto.repositorio.IProfesorRepositorio;
import com.itsqmet.proyecto.servicio.IProfesorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServicioImpl implements IProfesorServicio {
    @Autowired
    private IProfesorRepositorio profesorRepositorio;
    @Override
    public void insertProfesor(Profesor profesor) {
        profesorRepositorio.save(profesor);

    }
}
