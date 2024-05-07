package es.alten.cuentame.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "GenericObjectDTO", description = "Transfer object: Generic")
@SuppressWarnings("unused")
public @Data class GenericObjectDTO implements Serializable {

  private static final long serialVersionUID = 2463786643424711916L;

  private Long id;

  private String name;
}
