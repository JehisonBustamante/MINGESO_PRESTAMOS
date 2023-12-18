package cl.usach.mtisw.reporteservice.service;

import cl.usach.mtisw.reporteservice.entity.Reporte;
import cl.usach.mtisw.reporteservice.repository.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteService {
    @Autowired
    ReporteRepository reporteRepository;

    public List<Reporte> obtenerTodos()
    {
        return reporteRepository.findAll();
    }
}
