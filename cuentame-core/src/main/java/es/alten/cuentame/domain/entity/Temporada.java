package es.alten.cuentame.domain.entity;

import es.alten.cuentame.domain.ElvisEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "temporada")
@AllArgsConstructor
@Builder
public class Temporada extends ElvisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int n_temp;

    @Column(name = "resumen")
    private String resumen;

    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL)
    private List<Episodio> episodios;

    private Temporada() {
        this.episodios = new ArrayList<>();
    }


}
