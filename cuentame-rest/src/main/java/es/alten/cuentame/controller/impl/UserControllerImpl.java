package es.alten.cuentame.controller.impl;

import es.alten.cuentame.bo.UserBO;
import es.alten.cuentame.controller.UserController;
import es.alten.cuentame.domain.User;
import es.alten.cuentame.dto.UserDTO;
import es.alten.cuentame.rest.impl.RestControllerImpl;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Api(value = "users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserControllerImpl extends RestControllerImpl<User, UserDTO, Long, UserBO>
    implements UserController {}
