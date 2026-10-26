package edu.ruben.examen.entity;

import java.time.LocalDate;
import edu.ruben.examen.enumerates.Convocatoria;
import jakarta.persistence.*;

@Entity
@Table(name = "matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_matriculacion", nullable = false)
    private LocalDate fechaMatriculacion;

    private Double calificacion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Convocatoria convocatoria;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "asignatura_id", nullable = false)
    private Asignatura asignatura;

    public Matricula() {
    }

    public Matricula(LocalDate fechaMatriculacion, Double calificacion, Convocatoria convocatoria,
            Estudiante estudiante, Asignatura asignatura) {
        this.fechaMatriculacion = fechaMatriculacion;
        this.calificacion = calificacion;
        this.convocatoria = convocatoria;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}