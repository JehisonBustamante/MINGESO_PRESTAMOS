package cl.usach.mtisw.proyectorservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "proyector")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Proyector {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String tipo; // (EPSON o ViewSonic)
    private String estado; // (disponible, prestado o averiado)

}
