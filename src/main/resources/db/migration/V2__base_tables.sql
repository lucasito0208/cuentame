drop table if exists temporada;

create table temporada (
    n_temp bigint not null identity(1, 1) primary key,
    resumen nvarchar(600) not null,
    constraint temporada_unq_01 unique (n_temp)
);

insert into temporada (n_temp, resumen) values (1, 'La serie Cuéntame reflejaba los cambios experimentados en España a partir de 1968. La historia comienza el 2 de abril de 1968, dos días antes de la victoria en Eurovisión de la cantante Massiel y acaba el episodio con ese triunfo.');
insert into temporada (n_temp, resumen) values (2, 'En la segunda temporada... Mercedes y Nieves abren la boutique «Meyni» y Mercedes se encuentra en la calle a una niña de apenas unos días de nacimiento, que termina adoptando y bautizando, sin embargo, al final aparece la madre biológica de la niña.');
insert into temporada (n_temp, resumen) values (3, 'En la tercera temporada... Antonio intenta aspirar a una vida mejor y se produce el hundimiento de «Construcciones Nueva York», negocio emprendido únicamente para que Pablo Ramírez Sañudo (Pepe Sancho) y Jorge Lastra (Pepe Martín) se lucraran repartiéndose entre ambos 26 225 000 pesetas, pertenecientes a los clientes que habían invertido sus ahorros en pisos que nunca se llegaron a construir.');
insert into temporada (n_temp, resumen) values (4, 'En la cuarta temporada... Antonio intenta salir a flote tras una crisis vital sufrida por el desplome de «Construcciones Nueva York», regresa al ministerio, pero no tarda en irse, hastiado por el comportamiento de sus compañeros y tentado por la oferta de Merche, de trabajar como director de ventas en «Meyni», oferta que acepta a cambio de que Desi también trabaje en la empresa. El buen rumbo de la empresa, hace que don Pablo entre como gran socio capitalista. Toni y Clara (Silvia Espigado) tienen un idilio y Mike regresa y se marcha con Inés a Ibiza.');
insert into temporada (n_temp, resumen) values (5, 'En la quinta temporada... El matrimonio de Merche y Antonio pasa por un bache, Mercedes se queda embarazada y debido a la situación que atraviesa su matrimonio, decide de momento no contarle nada a Antonio y mantenerlo en secreto, sin embargo, Herminia se dará cuenta enseguida.');
insert into temporada (n_temp, resumen) values (6, 'En la sexta temporada... La familia Alcántara celebra con alegría la llegada de María (Esmeralda García) y con ella, llega la estabilidad a la familia tras un año algo turbulento... hasta que se reabre el caso «Construcciones Nueva York». Antonio trabaja en una imprenta de artes gráficas tras la quiebra de los negocios de don Pablo.');

--! EPISODIO !--

drop table if exists episodio;

create table episodio (
    id_episodio bigint not null identity(1, 1) primary key,
    n_episodio bigint not null,
    titulo varchar(100) not null,
    descripcion varchar(200) not null,
    n_temp bigint not null,
    constraint epi_fk_01 foreign key (n_temp) references temporada(n_temp),
    constraint epi_unq_01 unique (titulo)
);


insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (1, "El retorno del fugitivo", "La familia Alcántara ha comprado su primer televisor y esperan ansiosos la llegada del aparato. A Inés le han traído unas pastillas anticonceptivas.", 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (2, "Un cielo lleno de futbolines", "La primera comunión de Carlos llega en el peor momento ya que la familia Alcántara tiene muchos gastos y no sabe cómo hacer frente a lo que se avecina.", 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (3, "A lo lejos el mar", "A la familia Alcántara les gustaría ir a la playa, ya que ningún miembro conoce el mar. Lo malo es que la economía familiar no está para tirar cohetes", 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (4, "Las invasoras", "'Los Invasores' se ha convertido en la serie de moda en el país. Todo el mundo habla de extraterrestres, y el fenómeno coincide con otro fenómeno en los periódicos: se producen avistamientos de OVNIS.", 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, "Paz, amor y fantasía", "Dicen que el verano del 68 fue el verano del amor. En España y concretamente en el barrio de la familia Alcántara el amor estaba muy bien para Jackie Kennedy y Onassis,", 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (6, "El día de la raza", "Carlos, Luis y Josete se quedan sorprendidos ante un grupo de gitanos que se han instalado en su territorio particular. Antonio propone un plan para el día festivo,", 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (1, "Dos trompas y un destino", "En 1969, mientras estalla el caso Matesa, la píldora ya ha llegado a España. En el barrio se organiza un gran revuelo debido a que el cura Eugenio invita a una famosa ginecóloga", 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (2, "De aquí a la maternidad", "El bebé encontrado por Mercedes resulta ser una preciosa niña de la que se encariñan las tres mujeres de la familia Alcántara.", 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (3, '', '', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (4, '', '', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, '', '', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (1, '', '', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (2, '', '', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (3, '', '', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (4, '', '', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, '', '', 3);

--! PERSONAJE !--

drop table if exists personaje;

create table personaje (
    id_personaje bigint not null identity(1, 1) primary key,
    nombre varchar(100) not null,
    descripcion varchar(200) not null,
    sexo char(1) not null,
    ocupacion varchar(50) not null, 
    nacionalidad varchar(100) not null,
    constraint perso_unq_01 unique (nombre)
);

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('', '', '', '', '');

--! PERSONAJE-EPISODIO !--

drop table if exists personaje_episodio;

create table personaje_episodio (
    id_episodio bigint not null,
    id_personaje bigint not null,
    constraint epiperso_unq_01 unique (id_episodio, id_personaje),
    constraint epiperso_fk_01 foreign key (id_episodio) references episodio(id_episodio),
    constraint epiperso_fk_02 foreign key (id_personaje) references personaje(id_personaje)
);



--! ACTOR !--

drop table if exists actor;

create table actor (
    id_actor bigint not null primary key,
    id_personaje bigint not null,
    nombre varchar(100) not null,
    nacionalidad varchar(100) not null,
    fecha_nacimiento Date not null,
    sexo char(1) not null, 
    lugar_nacimiento varchar(50) not null,
    constraint actor_unq_01 unique (nombre),
    constraint actor_fk_01 foreign key (id_personaje) references personaje(id_personaje)
);

insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values ( 1, '', '', '', '', '');
