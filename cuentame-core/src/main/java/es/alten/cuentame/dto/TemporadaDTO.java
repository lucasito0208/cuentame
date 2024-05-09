package es.alten.cuentame.dto;

import es.alten.cuentame.domain.entity.Temporada;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;


@ApiModel(value="TemporadaDTO", description = "Data transfer object: Temporada")
@EqualsAndHashCode(callSuper = true)
@Data
public class TemporadaDTO extends ElvisBaseDTO<Temporada> {

    

    
}
