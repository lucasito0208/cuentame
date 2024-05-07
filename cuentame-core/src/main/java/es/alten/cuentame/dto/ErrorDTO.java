package es.alten.cuentame.dto;

import lombok.Data;

@SuppressWarnings("unused")
public @Data class ErrorDTO {
  private String message;
  private Integer index;
}
