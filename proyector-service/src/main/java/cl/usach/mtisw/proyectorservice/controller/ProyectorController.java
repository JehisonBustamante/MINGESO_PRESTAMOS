package cl.usach.mtisw.proyectorservice.controller;

import cl.usach.mtisw.proyectorservice.entity.Proyector;
import cl.usach.mtisw.proyectorservice.service.ProyectorService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyector")
public class ProyectorController {

    @Autowired
    ProyectorService proyectorService;

    @GetMapping("/todos")
    public ResponseEntity<List<Proyector>> todos()
    {
        List<Proyector> todos = proyectorService.obtenerTodos();
        if(todos.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(todos);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<String> crearNuevo(@RequestBody Proyector proyector)
    {
        proyectorService.guardarProyector(proyector);
        return ResponseEntity.ok("Proyector agregado con éxito");
    }

    @GetMapping("buscar/disponibles")
    public ResponseEntity<List<Proyector>> buscarDisponibles()
    {
        List<Proyector> disponibles = proyectorService.obtenerPorEstado("Disponible");
        if(disponibles.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(disponibles);
    }

    @GetMapping("/buscar/prestados")
    public ResponseEntity<List<Proyector>> buscarPrestados()
    {
        List<Proyector> prestados = proyectorService.obtenerPorEstado("Prestado");
        if(prestados.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(prestados);
    }

    @GetMapping("/buscar/daniados")
    public ResponseEntity<List<Proyector>> buscarAveriados()
    {
        List<Proyector> averiados = proyectorService.obtenerPorEstado("Averiado");
        if(averiados.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(averiados);
    }
    @GetMapping("/buscar/epson")
    public ResponseEntity<List<Proyector>> buscarEpson()
    {
        List<Proyector> epsons = proyectorService.obtenerPorTipo("Epson");
        if(epsons.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return  ResponseEntity.ok(epsons);
    }

    @GetMapping("/buscar/view-sonic")
    public ResponseEntity<List<Proyector>> buscarVS()
    {
        List<Proyector> vs = proyectorService.obtenerPorTipo("View Sonic");
        if(vs.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return  ResponseEntity.ok(vs);
    }

}
