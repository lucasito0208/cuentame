package es.alten.cuentame.dao;

import es.alten.cuentame.domain.entity.Actor;
import es.alten.cuentame.domain.entity.QActor;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

import java.util.List;

public interface ActorRepository extends ElvisBaseRepository<Actor, Integer, QActor>,
        JpaSpecificationExecutor<Actor>,
        QuerydslPredicateExecutor<Actor>,
        QuerydslBinderCustomizer<QActor> {

    // Consultar la lista de actores disponibles.

    @Query("SELECT a FROM Actor a")
    List<Actor> findAllWithActores();


    //⦁	Consultar los detalles de un actor específico, incluyendo su fecha de nacimiento y nacionalidad. Así como los detalles del personaje que interpretan.

    @Query("SELECT a FROM Actor a WHERE a.id = ?1")
    Actor findByIdWithDetails(Integer id);
}
