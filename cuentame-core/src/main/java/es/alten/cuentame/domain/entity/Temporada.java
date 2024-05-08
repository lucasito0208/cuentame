package es.alten.cuentame.domain.entity;

import es.alten.cuentame.domain.ElvisEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "temporada")
@AllArgsConstructor
public class Temporada extends ElvisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int n_temp;

    private String resumen;

    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL)
    private List<Personaje> personajes;

    private Temporada() {
        this.personajes = new ArrayList<>();
    }


}
