package edu.ruben.examen.Repository;

import edu.ruben.examen.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {
    int countByCreditos(int creditos);
}