package cl.usach.mtisw.devolucionservice.repository;

import cl.usach.mtisw.devolucionservice.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

    Profesor findByRUN(String RUN);

    List<Profesor> findAllByHabilitado(String habilitado);
}
