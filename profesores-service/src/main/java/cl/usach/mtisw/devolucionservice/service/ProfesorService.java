package cl.usach.mtisw.devolucionservice.service;

import cl.usach.mtisw.devolucionservice.entity.Profesor;
import cl.usach.mtisw.devolucionservice.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {
    @Autowired
    ProfesorRepository profesorRepository;

    public List<Profesor> obtenerTodos()
    {
        return profesorRepository.findAll();
    }

    public void guardarProfesor(Profesor profesor)
    {
        profesorRepository.save(profesor);
    }

    public void deshabilitarProfesor(Profesor profesor)
    {
        profesor.setHabilitado("No");
        profesorRepository.save(profesor);
    }

    public void habilitarProfesor(Profesor profesor)
    {
        profesor.setHabilitado("Si");
        profesorRepository.save(profesor);
    }
}
