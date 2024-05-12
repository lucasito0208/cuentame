package es.alten.cuentame.bo;

import es.alten.cuentame.domain.entity.QTemporada;
import es.alten.cuentame.domain.entity.Temporada;
import es.alten.cuentame.dto.TemporadaDTO;
import es.alten.cuentame.dto.filters.TemporadaFilterDTO;

import java.util.List;

public interface TemporadaBO extends GenericCRUDService<Temporada, Integer, QTemporada, TemporadaFilterDTO> {

    
    List<Temporada> findAll();

    Temporada findById(int n_temp);

    Temporada crearTemporada(Temporada temporada);

    TemporadaDTO toDTO(Temporada temp);
}
