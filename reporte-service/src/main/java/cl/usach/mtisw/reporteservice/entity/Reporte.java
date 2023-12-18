package cl.usach.mtisw.reporteservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "reporte")
@NoArgsConstructor
@AllArgsConstructor
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private LocalDate fechaPrestamo;
    private LocalTime horaPrestamo;
    private String profPrestamo;
    private LocalDate fechaDevolucion;
    private LocalTime horaDevolucion;
    private Integer horasOcupado;
    private String estadoDevuelto;
    private String usoProyector;
}
