package es.alten.cuentame.dao;

import es.alten.cuentame.domain.entity.Personaje;
import es.alten.cuentame.domain.entity.QPersonaje;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

public interface PersonajeRepository extends ElvisBaseRepository<Personaje, Integer, QPersonaje>,
        JpaSpecificationExecutor<Personaje>,
        QuerydslPredicateExecutor<Personaje>,
        QuerydslBinderCustomizer<QPersonaje>
{



}
