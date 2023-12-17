package cl.usach.mtisw.proyectorservice.controller;

import cl.usach.mtisw.proyectorservice.entity.Prestamo;
import cl.usach.mtisw.proyectorservice.service.PrestamoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {
    @Autowired
    PrestamoService prestamoService;

    @GetMapping("/registro")
    public ResponseEntity<List<Prestamo>> listarTodos()
    {
        List<Prestamo> prestamos = prestamoService.todos();
        if(prestamos.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(prestamos);
    }
}
