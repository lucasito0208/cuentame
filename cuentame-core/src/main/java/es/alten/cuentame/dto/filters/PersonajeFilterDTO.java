package es.alten.cuentame.dto.filters;

import es.alten.cuentame.domain.entity.Personaje;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;

public class PersonajeFilterDTO extends BaseFilterDTO<Personaje> {

    private int id_episodio;

    private String nombre;

    private String descripcion;

    private char sexo;

    private String ocupacion;

    private String nacionalidad;

    private int edad;
    @Override
    public Specification<Personaje> obtainFilterSpecification() {

        return (root, query, cb) -> {
            // Lista completa de personaje
            Predicate predicate =  cb.and();

            if (this.id_episodio != 0) {
                predicate = cb.and(predicate, root.get("id_episodio").in(this.id_episodio));
            }
            if (StringUtils.isNotBlank(this.nombre)) {
                predicate = cb.and(predicate, cb.like(root.get("nombre"), "%" + this.nombre + "%"));

            }
            if (StringUtils.isNotBlank(this.ocupacion)) {
                predicate = cb.and(predicate, cb.like(root.get("ocupacion"), "%" + this.ocupacion + "%"));

            }
            if (StringUtils.isNotBlank(this.nacionalidad)) {
                predicate = cb.and(predicate, cb.like(root.get("nacionalidad"), "%" + this.nacionalidad + "%"));
            }
            if (this.edad != 0) {
                predicate = cb.and(predicate, root.get("edad").in(this.edad));
            }
            return predicate;
        };
    }
}
