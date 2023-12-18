package cl.usach.mtisw.devolucionservice.service;

import cl.usach.mtisw.devolucionservice.entity.Devolucion;
import cl.usach.mtisw.devolucionservice.repository.DevolucionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevolucionService {
    @Autowired
    DevolucionRepository devolucionRepository;

    public List<Devolucion> obtenerTodos()
    {
        return devolucionRepository.findAll();
    }

    public List<Devolucion> registroPorProfesor(Integer id)
    {
        return devolucionRepository.findAllByIdProfesor(id);
    }
    public void nuevaDev(Devolucion devolucion)
    {
        devolucionRepository.save(devolucion);
    }
}
