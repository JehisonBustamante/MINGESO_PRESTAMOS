package cl.usach.mtisw.reporteservice.controller;

import cl.usach.mtisw.reporteservice.entity.Reporte;
import cl.usach.mtisw.reporteservice.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reporte")
public class ReporteController {
    @Autowired
    ReporteService reporteService;

    @GetMapping("/todos")
    public ResponseEntity<List<Reporte>> todosReportes()
    {
        List<Reporte> reportes = reporteService.obtenerTodos();
        if(reportes.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(reportes);
    }
}
