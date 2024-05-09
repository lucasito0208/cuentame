package es.alten.cuentame.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPersonaje is a Querydsl query type for Personaje
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPersonaje extends EntityPathBase<Personaje> {

    private static final long serialVersionUID = 1213797620L;

    public static final QPersonaje personaje = new QPersonaje("personaje");

    public final es.alten.cuentame.domain.QElvisEntity _super = new es.alten.cuentame.domain.QElvisEntity(this);

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Integer> edad = createNumber("edad", Integer.class);

    public final ListPath<Episodio, QEpisodio> episodios = this.<Episodio, QEpisodio>createList("episodios", Episodio.class, QEpisodio.class, PathInits.DIRECT2);

    public final NumberPath<Integer> id_personaje = createNumber("id_personaje", Integer.class);

    public final StringPath nacionalidad = createString("nacionalidad");

    public final StringPath nombre = createString("nombre");

    public final StringPath ocupacion = createString("ocupacion");

    public final ComparablePath<Character> sexo = createComparable("sexo", Character.class);

    public QPersonaje(String variable) {
        super(Personaje.class, forVariable(variable));
    }

    public QPersonaje(Path<? extends Personaje> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPersonaje(PathMetadata metadata) {
        super(Personaje.class, metadata);
    }

}

