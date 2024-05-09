package es.alten.cuentame.bo;

import es.alten.cuentame.domain.entity.Personaje;
import es.alten.cuentame.domain.entity.QPersonaje;
import es.alten.cuentame.dto.PersonajeFilterDTO;

public interface PersonajeBO extends GenericCRUDService<Personaje, Integer, QPersonaje, PersonajeFilterDTO> {

    //listar la lista de personajes
    Iterable<Personaje> listPersonajes();
}
