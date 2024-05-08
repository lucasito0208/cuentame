package es.alten.cuentame.domain.entity;

import es.alten.cuentame.domain.ElvisEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="personaje")
public class Personaje extends ElvisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_personaje;

    private String nombre;

    private String descripcion;

    private char sexo;

    private String ocupacion;

    private String nacionalidad;

    private int edad;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "personaje_temporada",
            joinColumns = @JoinColumn(name = "id_personaje"),
            inverseJoinColumns = @JoinColumn(name = "id_episodio"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"id_personaje", "id_episodio"})
    )
    private List<Episodio> episodios = new ArrayList<>();



}
