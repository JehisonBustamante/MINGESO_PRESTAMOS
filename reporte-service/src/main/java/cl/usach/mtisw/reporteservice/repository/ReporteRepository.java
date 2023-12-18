package cl.usach.mtisw.reporteservice.repository;

import cl.usach.mtisw.reporteservice.entity.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Integer> {
}
