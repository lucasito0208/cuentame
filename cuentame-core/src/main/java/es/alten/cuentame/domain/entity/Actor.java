package es.alten.cuentame.domain.entity;

import es.alten.cuentame.domain.ElvisEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "actor")
public class Actor extends ElvisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_actor;

    @ManyToOne
    @JoinColumn(name = "id_personaje", nullable = false)
    private Personaje id_personaje;

    private String nombre;

    private Date fechaNacimiento;

    private String nacionalidad;

    private String lugarNacimiento;

    @Enumerated(EnumType.STRING)
    private Genero sexo;

}
