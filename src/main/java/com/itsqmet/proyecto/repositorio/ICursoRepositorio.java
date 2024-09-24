package com.itsqmet.proyecto.repositorio;

import com.itsqmet.proyecto.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepositorio extends JpaRepository<Curso,Integer> {
}
