package com.itsqmet.proyecto.servicio;

import com.itsqmet.proyecto.modelo.Aula;

import java.util.List;
import java.util.Optional;

public interface IAulaServicio {

    public void insertarAula(Aula aula);
    public void actualizarAula(Aula aula);
    public List<Aula> listarAulas();
    public void eliminarAula(int id);
    public Optional<Aula> listarAula(int id);

}
