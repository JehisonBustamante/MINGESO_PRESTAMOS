package cl.usach.mtisw.proyectorservice.repository;

import cl.usach.mtisw.proyectorservice.entity.Proyector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProyectorRepository extends JpaRepository<Proyector, Integer> {

    List<Proyector> findAllByEstado(String estado);

    List<Proyector> findAllByTipo(String tipo);
}
