package es.alten.cuentame.dao;

import es.alten.cuentame.domain.entity.Personaje;
import es.alten.cuentame.domain.entity.QPersonaje;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.repository.query.Param;

public interface PersonajeRepository extends ElvisBaseRepository<Personaje, Integer, QPersonaje>,
        JpaSpecificationExecutor<Personaje>,
        QuerydslPredicateExecutor<Personaje>,
        QuerydslBinderCustomizer<QPersonaje>
{

    //Consultar los detalles de un personaje específico, incluyendo el actor o actores que lo interpretan.

    //@Query("SELECT p FROM Personaje p LEFT JOIN FETCH p.actors WHERE p.id_personaje = :id_personaje")
    //Personaje findByIdPersonajeWithActors(@Param("id_personaje") int id_personaje);




}
