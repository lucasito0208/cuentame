drop table if exists temporada;

create table temporada (
    n_temp bigint not null identity(1, 1) primary key,
    resumen varchar(600) not null,
    constraint temporada_unq_01 unique (n_temp)
);

insert into temporada (n_temp, resumen) values (1, 'La serie Cuéntame reflejaba los cambios experimentados en España a partir de 1968. La historia comienza el 2 de abril de 1968, dos días antes de la victoria en Eurovisión de la cantante Massiel y acaba el episodio con ese triunfo.');
insert into temporada (n_temp, resumen) values (2, 'En la segunda temporada... Mercedes y Nieves abren la boutique «Meyni» y Mercedes se encuentra en la calle a una niña de apenas unos días de nacimiento, que termina adoptando y bautizando, sin embargo, al final aparece la madre biológica de la niña.');
insert into temporada (n_temp, resumen) values (3, 'En la tercera temporada... Antonio intenta aspirar a una vida mejor y se produce el hundimiento de «Construcciones Nueva York», negocio emprendido únicamente para que Pablo Ramírez Sañudo (Pepe Sancho) y Jorge Lastra (Pepe Martín) se lucraran repartiéndose entre ambos 26 225 000 pesetas, pertenecientes a los clientes que habían invertido sus ahorros en pisos que nunca se llegaron a construir.');
insert into temporada (n_temp, resumen) values (4, 'En la cuarta temporada... Antonio intenta salir a flote tras una crisis vital sufrida por el desplome de «Construcciones Nueva York», regresa al ministerio, pero no tarda en irse, hastiado por el comportamiento de sus compañeros y tentado por la oferta de Merche, de trabajar como director de ventas en «Meyni», oferta que acepta a cambio de que Desi también trabaje en la empresa. El buen rumbo de la empresa, hace que don Pablo entre como gran socio capitalista. Toni y Clara (Silvia Espigado) tienen un idilio y Mike regresa y se marcha con Inés a Ibiza.');
insert into temporada (n_temp, resumen) values (5, 'En la quinta temporada... El matrimonio de Merche y Antonio pasa por un bache, Mercedes se queda embarazada y debido a la situación que atraviesa su matrimonio, decide de momento no contarle nada a Antonio y mantenerlo en secreto, sin embargo, Herminia se dará cuenta enseguida.');
insert into temporada (n_temp, resumen) values (6, 'En la sexta temporada... La familia Alcántara celebra con alegría la llegada de María (Esmeralda García) y con ella, llega la estabilidad a la familia tras un año algo turbulento... hasta que se reabre el caso «Construcciones Nueva York». Antonio trabaja en una imprenta de artes gráficas tras la quiebra de los negocios de don Pablo.');
