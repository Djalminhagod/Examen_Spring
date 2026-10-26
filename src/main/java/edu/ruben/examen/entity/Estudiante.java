package edu.ruben.examen.entity;

import jakarta.persistence.*;

@Entity

public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, unique = false)
    private String nombre;
    @Column(name = "creditos", nullable = false, unique = false)
    private int creditos;
}
