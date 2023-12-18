package cl.usach.mtisw.prestamoservice.service;

import cl.usach.mtisw.prestamoservice.entity.Prestamo;
import cl.usach.mtisw.prestamoservice.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {
    @Autowired
    PrestamoRepository prestamoRepository;

    public List<Prestamo> todos()
    {
        return prestamoRepository.findAll();
    }

    public List<Prestamo> prestamosPorProfesor(Integer id)
    {
        return prestamoRepository.findAllByIdProfesor(id);
    }
    public void nuevoPrestamo(Prestamo prestamo)
    {
        prestamoRepository.save(prestamo);
    }


}
