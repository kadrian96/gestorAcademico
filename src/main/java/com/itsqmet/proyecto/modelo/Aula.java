package com.itsqmet.proyecto.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name="tbl_Aula")
public class Aula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAula;
    private String nombreAula;
    private int capacidad;
    @OneToMany(mappedBy = "idAula", cascade = CascadeType.ALL)
    private List<Curso> idCurso= new ArrayList<>();
    /*
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso idCurso;
*/

}
