package es.alten.cuentame.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTemporada is a Querydsl query type for Temporada
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTemporada extends EntityPathBase<Temporada> {

    private static final long serialVersionUID = -1949372524L;

    public static final QTemporada temporada = new QTemporada("temporada");

    public final es.alten.cuentame.domain.QElvisEntity _super = new es.alten.cuentame.domain.QElvisEntity(this);

    public final ListPath<Episodio, QEpisodio> episodios = this.<Episodio, QEpisodio>createList("episodios", Episodio.class, QEpisodio.class, PathInits.DIRECT2);

    public final NumberPath<Integer> n_temp = createNumber("n_temp", Integer.class);

    public final StringPath resumen = createString("resumen");

    public QTemporada(String variable) {
        super(Temporada.class, forVariable(variable));
    }

    public QTemporada(Path<? extends Temporada> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTemporada(PathMetadata metadata) {
        super(Temporada.class, metadata);
    }

}

