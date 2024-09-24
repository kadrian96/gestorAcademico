package com.itsqmet.proyecto.repositorio;

import com.itsqmet.proyecto.modelo.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatriculaRepositorio extends JpaRepository<Matricula,Integer> {
}
