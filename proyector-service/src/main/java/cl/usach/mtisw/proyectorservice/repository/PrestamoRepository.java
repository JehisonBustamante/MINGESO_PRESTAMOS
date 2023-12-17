package cl.usach.mtisw.proyectorservice.repository;

import cl.usach.mtisw.proyectorservice.entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

    List<Prestamo> findAllByIdProfesor(Integer idProfesor);
}
