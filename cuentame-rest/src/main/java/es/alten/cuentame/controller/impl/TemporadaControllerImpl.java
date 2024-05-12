package es.alten.cuentame.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.alten.cuentame.bo.TemporadaBO;
import es.alten.cuentame.bo.impl.TemporadaBOImpl;
import es.alten.cuentame.controller.TemporadaController;
import es.alten.cuentame.domain.entity.Temporada;
import es.alten.cuentame.dto.TemporadaDTO;
import es.alten.cuentame.rest.impl.RestControllerImpl;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/temporada")
@Api(value = "temporadas", produces = MediaType.APPLICATION_JSON_VALUE)
@SuppressWarnings("unused")
public class TemporadaControllerImpl extends RestControllerImpl<Temporada, TemporadaDTO, Integer, TemporadaBO>
    implements TemporadaController{

    private static final Logger LOG = LoggerFactory.getLogger(TemporadaControllerImpl.class);

    @Override
    @GetMapping("/{id}")
    public Temporada dameTemporada(@PathVariable("id") int n_temp) {
        LOG.info("Temporada mostrada");
        return this.bo.findById(n_temp);
    }

    @Override
    @PostMapping("/crear/{id}")
    public ResponseEntity<TemporadaDTO> crearTemporada(@PathVariable("id") int n_temp, Temporada temporada) {
        
        //temporada = Temporada.builder().n_temp(n_temp).resumen(null)
       // LOG.info("Temporada creada");
        //return ResponseEntity.status(HttpStatus.CREATED).body(this.bo.crearTemporada(null)).getBody();
        return null;
    }
    
}
