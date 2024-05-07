package es.alten.cuentame.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/** Entity stores information related to User. */
@SuppressWarnings("unused")
@Entity
@XmlRootElement
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "users")
public class User extends Audit {

  private static final long serialVersionUID = 7389705441694025319L;

  @Column(name = "email", nullable = false, length = 100)
  @NotNull
  @Size(max = 100)
  private String email;
}
