package edu.ruben.examen.entity;

import java.time.LocalDate;

import edu.ruben.examen.enumerates.*;
import jakarta.persistence.*;

@Entity

public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fechaMatriculacion", nullable = false, unique = false)
    private LocalDate fecha_Matriculacion;
    @Column(name = "calificacion", nullable = false, unique = false)
    private Double calificacion;
    @Column(name = "convocatoria", nullable = false, unique = false)
    private Convocatoria convocatorias;

}
