package es.alten.cuentame.dto;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import es.alten.cuentame.domain.entity.Episodio;
import javax.persistence.criteria.Predicate;
import es.alten.cuentame.domain.entity.Temporada;
import org.apache.commons.lang3.StringUtils;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings({"UnusedDeclaration"})
@ApiModel(value = "TemporadaFilterDTO", description = "Temporada filter")
@EqualsAndHashCode(callSuper = true)
@Data
public class TemporadaFilterDTO extends BaseFilterDTO<Temporada> {

    private String resumen;

    private List<Episodio> episodios;
    
    
    @Override
    public Specification<Temporada> obtainFilterSpecification() {

        return (root, query, cb) -> {

            Predicate predicate =  cb.and();
            if (StringUtils.isNotBlank(this.resumen)) {
                predicate = cb.and(predicate, cb.like(root.get("resumen"), "%" + this.resumen + "%"));

            }
            if (this.episodios != null && !this.episodios.isEmpty()) {
                predicate = cb.and(predicate, root.get("episodios").in(this.episodios));
            }
            return predicate;

        };
    }
    
}
