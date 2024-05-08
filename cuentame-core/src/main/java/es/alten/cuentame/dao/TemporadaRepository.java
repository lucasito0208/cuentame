package es.alten.cuentame.dao;

import es.alten.cuentame.domain.entity.QTemporada;
import es.alten.cuentame.domain.entity.Temporada;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

import java.util.List;

public interface TemporadaRepository extends
        ElvisBaseRepository<Temporada, Integer, QTemporada>,
        JpaSpecificationExecutor<Temporada>,
        QuerydslPredicateExecutor<Temporada>,
        QuerydslBinderCustomizer<QTemporada>
{

    Temporada findByN_temp(Integer n_temp);

    List<Temporada> findAllTemporadas();
}
