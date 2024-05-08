package es.alten.cuentame.dao;

import es.alten.cuentame.domain.entity.Episodio;
import es.alten.cuentame.domain.entity.QEpisodio;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.repository.query.Param;

public interface EpisodioRepository extends ElvisBaseRepository<Episodio, Integer, QEpisodio>,
        JpaSpecificationExecutor<Episodio>,
        QuerydslPredicateExecutor<Episodio>,
        QuerydslBinderCustomizer<QEpisodio>
{

    //Consultar los detalles de un episodio específico. Incluida lista de personajes que aparecen.

    @Query("SELECT e FROM Episodio e LEFT JOIN FETCH e.personajes WHERE e.id_episodio = :id_episodio")
    Episodio findByIdEpisodioWithPersonajes(@Param("id_episodio") int id_episodio);
}
