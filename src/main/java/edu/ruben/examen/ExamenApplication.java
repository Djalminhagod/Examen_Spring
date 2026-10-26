package edu.ruben.examen;

import edu.ruben.examen.entity.Estudiante;
import edu.ruben.examen.Repository.IAsignaturaRepository;
import edu.ruben.examen.Repository.IEstudianteRepository;
import edu.ruben.examen.Repository.IMatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Autowired
	private IAsignaturaRepository asignaturaRepository;

	@Autowired
	private IMatriculaRepository matriculaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("inicio del programa");

		System.out.println("probando los count");
		System.out.println("estudiantes: " + estudianteRepository.count());
		System.out.println("asignaturas: " + asignaturaRepository.count());
		System.out.println("matriculas: " + matriculaRepository.count());

		System.out.println("probando buscar estudiante por id");
		Estudiante estuudiante = estudianteRepository.findById(6L).orElse(null);
		if (estuudiante != null) {
			System.out.println("nombre alumno: " + estuudiante.getNombre());
			System.out.println("numero expediente: " + estuudiante.getExpedienteAcademico().getNumeroExpediente());
		}

		System.out.println("probando metodo por dni");
		estudianteRepository.findByDni("12345678A").ifPresent(e -> {
			System.out.println("encontrado: " + e.getNombre() + " " + e.getApellidos());
		});

		System.out.println("probando contar por creditos");
		int totalAsig = asignaturaRepository.countByCreditos(3);
		System.out.println("resultado creditos 6: " + totalAsig);

	}
}