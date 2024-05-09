package es.alten.cuentame.bo;

import es.alten.cuentame.domain.entity.QTemporada;
import es.alten.cuentame.domain.entity.Temporada;
import es.alten.cuentame.dto.TemporadaFilterDTO;

import java.util.List;

public interface TemporadaBO extends GenericCRUDService<Temporada, Integer, QTemporada, TemporadaFilterDTO> {

    @Override
    List<Temporada> findAll();
}
