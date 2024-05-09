package es.alten.cuentame.dto.filters;

import es.alten.cuentame.domain.entity.Episodio;

import org.springframework.data.jpa.domain.Specification;

public class EpisodioFilterDTO extends BaseFilterDTO<Episodio>{
    @Override
    public Specification<Episodio> obtainFilterSpecification() {
        return null;
    }
}
