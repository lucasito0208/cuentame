package es.alten.cuentame.bo;

import es.alten.cuentame.domain.entity.Episodio;
import es.alten.cuentame.domain.entity.QEpisodio;
import es.alten.cuentame.dto.EpisodioFilterDTO;

public interface EpisodioBO extends GenericCRUDService<Episodio, Integer, QEpisodio, EpisodioFilterDTO> {


}
