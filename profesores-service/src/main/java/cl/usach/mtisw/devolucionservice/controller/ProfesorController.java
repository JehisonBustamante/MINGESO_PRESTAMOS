package cl.usach.mtisw.devolucionservice.controller;

import cl.usach.mtisw.devolucionservice.entity.Profesor;
import cl.usach.mtisw.devolucionservice.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    ProfesorService profesorService;

    @GetMapping("/todos")
    public ResponseEntity<List<Profesor>> todos()
    {
        List<Profesor> todos = profesorService.obtenerTodos();
        if(todos.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(todos);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<String> crearNuevo(@RequestBody Profesor profesor)
    {
        profesorService.guardarProfesor(profesor);
        return ResponseEntity.ok("Profesor agregado con éxito");
    }
}
