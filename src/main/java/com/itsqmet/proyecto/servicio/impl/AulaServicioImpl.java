package com.itsqmet.proyecto.servicio.impl;

import com.itsqmet.proyecto.modelo.Aula;
import com.itsqmet.proyecto.repositorio.IAulaRepositorio;
import com.itsqmet.proyecto.servicio.IAulaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaServicioImpl implements IAulaServicio {

    @Autowired
    private IAulaRepositorio aulaRepositorio;
    @Override
    public void insertarAula(Aula aula) {
        aulaRepositorio.save(aula);
    }

    @Override
    public void actualizarAula(Aula aula) {
        aulaRepositorio.save(aula);

    }

    @Override
    public List<Aula> listarAulas() {
        return aulaRepositorio.findAll();
    }

    @Override
    public void eliminarAula(int id) {
        aulaRepositorio.deleteById(id);

    }

    @Override
    public Optional<Aula> listarAula(int id) {
        return aulaRepositorio.findById(id);
    }
}
