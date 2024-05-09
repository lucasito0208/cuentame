package es.alten.cuentame.dto;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.alten.cuentame.domain.entity.Episodio;
import es.alten.cuentame.domain.entity.Temporada;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel(value="TemporadaDTO", description = "Data transfer object: Temporada")
@EqualsAndHashCode(callSuper = true)
@Data
public class TemporadaDTO extends ElvisBaseDTO<Temporada> {

    private static final Logger LOG = LoggerFactory.getLogger(TemporadaDTO.class);

    private String resumen;

    private List<Episodio> episodios;
 
}
