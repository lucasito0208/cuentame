package es.alten.cuentame.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEpisodio is a Querydsl query type for Episodio
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEpisodio extends EntityPathBase<Episodio> {

    private static final long serialVersionUID = 1456896419L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEpisodio episodio = new QEpisodio("episodio");

    public final es.alten.cuentame.domain.QElvisEntity _super = new es.alten.cuentame.domain.QElvisEntity(this);

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Integer> id_episodio = createNumber("id_episodio", Integer.class);

    public final NumberPath<Integer> num_episodio = createNumber("num_episodio", Integer.class);

    public final ListPath<Personaje, QPersonaje> personajes = this.<Personaje, QPersonaje>createList("personajes", Personaje.class, QPersonaje.class, PathInits.DIRECT2);

    public final QTemporada temporada;

    public final StringPath titulo = createString("titulo");

    public QEpisodio(String variable) {
        this(Episodio.class, forVariable(variable), INITS);
    }

    public QEpisodio(Path<? extends Episodio> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEpisodio(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEpisodio(PathMetadata metadata, PathInits inits) {
        this(Episodio.class, metadata, inits);
    }

    public QEpisodio(Class<? extends Episodio> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.temporada = inits.isInitialized("temporada") ? new QTemporada(forProperty("temporada")) : null;
    }

}

