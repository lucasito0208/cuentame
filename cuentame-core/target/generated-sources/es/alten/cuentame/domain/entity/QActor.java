package es.alten.cuentame.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QActor is a Querydsl query type for Actor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QActor extends EntityPathBase<Actor> {

    private static final long serialVersionUID = 1999219586L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QActor actor = new QActor("actor");

    public final es.alten.cuentame.domain.QElvisEntity _super = new es.alten.cuentame.domain.QElvisEntity(this);

    public final DateTimePath<java.util.Date> fechaNacimiento = createDateTime("fechaNacimiento", java.util.Date.class);

    public final NumberPath<Integer> id_actor = createNumber("id_actor", Integer.class);

    public final QPersonaje id_personaje;

    public final StringPath lugarNacimiento = createString("lugarNacimiento");

    public final StringPath nacionalidad = createString("nacionalidad");

    public final StringPath nombre = createString("nombre");

    public final EnumPath<Genero> sexo = createEnum("sexo", Genero.class);

    public QActor(String variable) {
        this(Actor.class, forVariable(variable), INITS);
    }

    public QActor(Path<? extends Actor> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QActor(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QActor(PathMetadata metadata, PathInits inits) {
        this(Actor.class, metadata, inits);
    }

    public QActor(Class<? extends Actor> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id_personaje = inits.isInitialized("id_personaje") ? new QPersonaje(forProperty("id_personaje")) : null;
    }

}

