package com.itsqmet.proyecto.repositorio;

import com.itsqmet.proyecto.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorRepositorio extends JpaRepository<Profesor, Integer> {
}
