package es.alten.cuentame.dto;

import es.alten.cuentame.domain.entity.Personaje;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@ApiModel(value = "PersonajeDTO", description = "Data transfer object: personaje")
@EqualsAndHashCode(callSuper = true)
public class PersonajeDTO extends ElvisBaseDTO<Personaje>{

    private static final Logger LOG = LoggerFactory.getLogger(PersonajeDTO.class);


    private String nombre;

    private String descripcion;

    private char sexo;

    private String ocupacion;

    private String nacionalidad;

    private int edad;


}
