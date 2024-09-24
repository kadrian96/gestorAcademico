package com.itsqmet.proyecto.modelo;


import jakarta.persistence.*;
import lombok.Data;

import javax.naming.spi.NamingManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="tbl_Curso")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    private String cursoNombre;
    private String descripcion;
    private Double creditos;
    @OneToMany(mappedBy = "idCurso", cascade = CascadeType.ALL)
    private List<Matricula> matriculas = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "id_aula")
    private Aula idAula;
    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor idProfesor;
}
