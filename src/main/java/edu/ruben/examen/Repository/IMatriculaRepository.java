package edu.ruben.examen.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ruben.examen.entity.Matricula;

public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {
    List<Matricula> findByCalificacion(Double calificacion);

}
