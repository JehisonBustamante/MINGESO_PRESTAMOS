package cl.usach.mtisw.proyectorservice.service;

import cl.usach.mtisw.proyectorservice.entity.Prestamo;
import cl.usach.mtisw.proyectorservice.entity.Proyector;
import cl.usach.mtisw.proyectorservice.repository.PrestamoRepository;
import cl.usach.mtisw.proyectorservice.repository.ProyectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectorService {
    @Autowired
    ProyectorRepository proyectorRepository;

    @Autowired
    DevolucionService devolucionService;

    @Autowired
    PrestamoService prestamoService;

    public List<Proyector> obtenerTodos()
    {
        return proyectorRepository.findAll();
    }

    public void guardarProyector(Proyector proyector)
    {
        proyectorRepository.save(proyector);
    }

    public List<Proyector> obtenerPorEstado(String estado)
    {
        return proyectorRepository.findAllByEstado(estado);
    }

    public List<Proyector> obtenerPorTipo(String tipo)
    {
        return proyectorRepository.findAllByTipo(tipo);
    }



}
