package cl.usach.mtisw.devolucionservice.repository;

import cl.usach.mtisw.devolucionservice.entity.Devolucion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevolucionRepository extends JpaRepository<Devolucion, Integer> {

    List<Devolucion> findAllByIdProfesor(Integer idProfesor);
}
