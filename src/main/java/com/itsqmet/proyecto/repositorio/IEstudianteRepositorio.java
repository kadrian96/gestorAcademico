package com.itsqmet.proyecto.repositorio;

import com.itsqmet.proyecto.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante,Integer> {
}
