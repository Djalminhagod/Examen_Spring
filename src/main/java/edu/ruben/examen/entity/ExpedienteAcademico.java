package edu.ruben.examen.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "expedientes_academicos")
public class ExpedienteAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero_expediente", nullable = false, unique = true)
    private String numero_Expediente;
    @Column(name = "fecha_apertura", nullable = false, unique = false)
    private LocalDate fecha_Apertura;
    @Column(name = "nota_media_acceso", nullable = false, unique = false)
    private Double nota_Media_Acceso;

}
