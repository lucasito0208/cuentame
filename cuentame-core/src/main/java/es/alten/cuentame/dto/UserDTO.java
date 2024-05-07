package es.alten.cuentame.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import es.alten.cuentame.domain.User;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import java.util.Date;

@ApiModel(value = "UserDTO", description = "Data transfer object: user")
@EqualsAndHashCode(callSuper = true)
@Data
@SuppressWarnings({"unused", "WeakerAccess"})
public class UserDTO extends ElvisBaseDTO<User> {

  private static final long serialVersionUID = 883832912345648321L;
  private static final Logger LOG = LoggerFactory.getLogger(UserDTO.class);

  @NotNull
  private String email;

  @JsonIgnore private Date createDate;
  @JsonIgnore private Date updateDate;
  @JsonIgnore private Long createdBy;
  @JsonIgnore private Long updatedBy;
}
