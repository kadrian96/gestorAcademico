package com.itsqmet.proyecto.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="tbl_Profesor")
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    @Column(name="nombreProfesor",length=50)
    private String nombre;
    private String apellidoProfesor;
    private String email;
    private String especializacion;
    @OneToMany(mappedBy = "idProfesor",cascade = CascadeType.ALL)
    private List<Curso> cursos = new ArrayList<>();

}
