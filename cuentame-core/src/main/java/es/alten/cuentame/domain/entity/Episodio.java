package es.alten.cuentame.domain.entity;


import es.alten.cuentame.domain.ElvisEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "episodio")
public class Episodio extends ElvisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_episodio;

    @OneToMany
    private Temporada n_temp;

    private int num_episodio;

    @Column(unique = true)
    private String titulo;

    private String descripcion;

    @ManyToMany(mappedBy = "episodios")
    private List<Personaje> personajes = new ArrayList<>();

}
