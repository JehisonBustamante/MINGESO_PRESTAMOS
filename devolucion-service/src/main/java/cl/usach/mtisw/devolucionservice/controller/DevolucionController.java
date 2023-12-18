package cl.usach.mtisw.devolucionservice.controller;

import cl.usach.mtisw.devolucionservice.entity.Devolucion;
import cl.usach.mtisw.devolucionservice.service.DevolucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devolucion")
public class DevolucionController {

    @Autowired
    DevolucionService devolucionService;

    @GetMapping("/registro")
    public ResponseEntity<List<Devolucion>> todos()
    {
        List<Devolucion> devoluciones = devolucionService.obtenerTodos();
        if(devoluciones.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(devoluciones);
    }

    @PostMapping("/nueva-devolucion")
    public ResponseEntity<String> crearDev(@RequestBody Devolucion devolucion)
    {
        devolucionService.nuevaDev(devolucion);
        return ResponseEntity.ok("Devolucion realizada con exito");
    }

}
