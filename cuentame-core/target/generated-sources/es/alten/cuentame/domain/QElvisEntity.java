package es.alten.cuentame.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QElvisEntity is a Querydsl query type for ElvisEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QElvisEntity extends EntityPathBase<ElvisEntity> {

    private static final long serialVersionUID = 1875329220L;

    public static final QElvisEntity elvisEntity = new QElvisEntity("elvisEntity");

    public QElvisEntity(String variable) {
        super(ElvisEntity.class, forVariable(variable));
    }

    public QElvisEntity(Path<? extends ElvisEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QElvisEntity(PathMetadata metadata) {
        super(ElvisEntity.class, metadata);
    }

}

