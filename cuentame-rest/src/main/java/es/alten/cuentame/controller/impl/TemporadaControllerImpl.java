package es.alten.cuentame.controller.impl;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.alten.cuentame.bo.TemporadaBO;
import es.alten.cuentame.controller.TemporadaController;
import es.alten.cuentame.domain.entity.Temporada;
import es.alten.cuentame.dto.TemporadaDTO;
import es.alten.cuentame.rest.impl.RestControllerImpl;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/temporada")
@Api(value = "temporadas", produces = MediaType.APPLICATION_JSON_VALUE)
public class TemporadaControllerImpl extends RestControllerImpl<Temporada, TemporadaDTO, Integer, TemporadaBO>
    implements TemporadaController{
    
}
