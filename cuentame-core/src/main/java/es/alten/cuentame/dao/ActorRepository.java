package es.alten.cuentame.dao;

import es.alten.cuentame.domain.entity.Actor;
import es.alten.cuentame.domain.entity.QActor;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

public interface ActorRepository extends ElvisBaseRepository<Actor, Integer, QActor>,
        JpaSpecificationExecutor<Actor>,
        QuerydslPredicateExecutor<Actor>,
        QuerydslBinderCustomizer<QActor> {
}
