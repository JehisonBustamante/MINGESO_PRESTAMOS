package cl.usach.mtisw.prestamoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "prestamo")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private LocalDate fecha;
    private LocalTime hora;
    private Integer idProfesor;
    private String uso;
}
