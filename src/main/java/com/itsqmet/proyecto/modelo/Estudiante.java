package com.itsqmet.proyecto.modelo;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="tbl_Estudiante")
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;
    private String email;
    @OneToMany(mappedBy = "idEstudiante", cascade = CascadeType.ALL)   //nombre con el que se hara el mapeo y el con el que se debera crear la clave foranea en la otra entidad
    private List<Matricula> matriculas = new ArrayList<>();

}
