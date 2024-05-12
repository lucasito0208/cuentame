package es.alten.cuentame.controller;

import org.springframework.http.ResponseEntity;

import es.alten.cuentame.domain.entity.Temporada;
import es.alten.cuentame.dto.TemporadaDTO;
import es.alten.cuentame.rest.BaseController;

public interface TemporadaController extends BaseController {

    Temporada dameTemporada(int n_temp);

    ResponseEntity<TemporadaDTO> crearTemporada(int n_temp, Temporada temporada);
    
}
