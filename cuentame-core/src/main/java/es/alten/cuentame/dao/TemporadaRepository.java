package es.alten.cuentame.dao;

import es.alten.cuentame.domain.entity.QTemporada;
import es.alten.cuentame.domain.entity.Temporada;
import es.alten.cuentame.dto.TemporadaDTO;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

import java.util.List;

@SuppressWarnings("unused")
public interface TemporadaRepository extends
        ElvisBaseRepository<Temporada, Integer, QTemporada>,
        JpaSpecificationExecutor<Temporada>,
        QuerydslPredicateExecutor<Temporada>,
        QuerydslBinderCustomizer<QTemporada>
{

        Temporada findById(int n_temp);

        List<Temporada> findAll();

        
        

}
