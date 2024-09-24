package com.itsqmet.proyecto.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="tbl_Matricula")
public class Matricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatricula;
    private Date fechaMatricula;
    @ManyToOne
    @JoinColumn(name="id_estudiante") //Nombre que tendra la columna agregada
    private Estudiante idEstudiante;  //nombre de la clave foranea con la que se mapeo
    @ManyToOne
    @JoinColumn(name="id_curso")
    private Curso idCurso;




}
