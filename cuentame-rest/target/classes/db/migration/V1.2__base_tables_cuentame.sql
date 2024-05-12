
--! TEMPORADA !--
drop table if exists actor;
drop table if exists personaje_episodio;
drop table if exists personaje;
drop table if exists episodio;
drop table if exists temporada;

create table temporada (
    n_temp bigint not null identity(1, 1) primary key,
    resumen varchar(max) not null,
    constraint temporada_unq_01 unique (n_temp)
);

insert into temporada (resumen) values ('La serie Cuéntame reflejaba los cambios experimentados en España a partir de 1968. La historia comienza el 2 de abril de 1968, dos días antes de la victoria en Eurovisión de la cantante Massiel y acaba el episodio con ese triunfo.');
insert into temporada (resumen) values ('En la segunda temporada... Mercedes y Nieves abren la boutique «Meyni» y Mercedes se encuentra en la calle a una niña de apenas unos días de nacimiento, que termina adoptando y bautizando, sin embargo, al final aparece la madre biológica de la niña.');
insert into temporada (resumen) values ('En la tercera temporada... Antonio intenta aspirar a una vida mejor y se produce el hundimiento de «Construcciones Nueva York», negocio emprendido únicamente para que Pablo Ramírez Sañudo (Pepe Sancho) y Jorge Lastra (Pepe Martín) se lucraran repartiéndose entre ambos 26 225 000 pesetas, pertenecientes a los clientes que habían invertido sus ahorros en pisos que nunca se llegaron a construir.');
insert into temporada (resumen) values ('En la cuarta temporada... Antonio intenta salir a flote tras una crisis vital sufrida por el desplome de «Construcciones Nueva York», regresa al ministerio, pero no tarda en irse, hastiado por el comportamiento de sus compañeros y tentado por la oferta de Merche, de trabajar como director de ventas en «Meyni», oferta que acepta a cambio de que Desi también trabaje en la empresa. El buen rumbo de la empresa, hace que don Pablo entre como gran socio capitalista. Toni y Clara (Silvia Espigado) tienen un idilio y Mike regresa y se marcha con Inés a Ibiza.');
insert into temporada (resumen) values ('En la quinta temporada... El matrimonio de Merche y Antonio pasa por un bache, Mercedes se queda embarazada y debido a la situación que atraviesa su matrimonio, decide de momento no contarle nada a Antonio y mantenerlo en secreto, sin embargo, Herminia se dará cuenta enseguida.');
insert into temporada (resumen) values ('En la sexta temporada... La familia Alcántara celebra con alegría la llegada de María (Esmeralda García) y con ella, llega la estabilidad a la familia tras un año algo turbulento... hasta que se reabre el caso «Construcciones Nueva York». Antonio trabaja en una imprenta de artes gráficas tras la quiebra de los negocios de don Pablo.');

--! EPISODIO !--


create table episodio (
    id_episodio bigint not null identity(1, 1) primary key,
    n_episodio bigint not null,
    titulo varchar(100) not null,
    descripcion varchar(max) not null,
    n_temp bigint not null,
    constraint epi_fk_01 foreign key (n_temp) references temporada(n_temp),
    constraint epi_unq_01 unique (titulo)
);


insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (1, 'El retorno del fugitivo', 'La familia Alcántara ha comprado su primer televisor y esperan ansiosos la llegada del aparato. A Inés le han traído unas pastillas anticonceptivas.', 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (2, 'Un cielo lleno de futbolines', 'La primera comunión de Carlos llega en el peor momento ya que la familia Alcántara tiene muchos gastos y no sabe cómo hacer frente a lo que se avecina.', 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (3, 'A lo lejos el mar', 'A la familia Alcántara les gustaría ir a la playa, ya que ningún miembro conoce el mar. Lo malo es que la economía familiar no está para tirar cohetes', 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (4, 'Las invasoras', '"Los Invasores" se ha convertido en la serie de moda en el país. Todo el mundo habla de extraterrestres, y el fenómeno coincide con otro fenómeno en los periódicos: se producen avistamientos de OVNIS.', 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, 'Paz, amor y fantasía', 'Dicen que el verano del 68 fue el verano del amor. En España y concretamente en el barrio de la familia Alcántara el amor estaba muy bien para Jackie Kennedy y Onassis', 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (6, 'El día de la raza', 'Carlos, Luis y Josete se quedan sorprendidos ante un grupo de gitanos que se han instalado en su territorio particular. Antonio propone un plan para el día festivo', 1);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (1, 'Dos trompas y un destino', 'En 1969, mientras estalla el caso Matesa, la píldora ya ha llegado a España. En el barrio se organiza un gran revuelo debido a que el cura Eugenio invita a una famosa ginecóloga', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (2, 'De aquí a la maternidad', 'El bebé encontrado por Mercedes resulta ser una preciosa niña de la que se encariñan las tres mujeres de la familia Alcántara.', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (3, 'Hundido', 'Antonio sigue soñando con comprarse un coche; Don Pablo le enseña sus trampas para comprarse el mítico Seat sin necesidad de pagar luego las letras. Alcántara, mas honesto que su jefe, comienza por sacarse el carnet de conducir.', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (4, 'La mamá política', 'La llegada de la madre de Antonio, doña Pura, a la casa de los Alcántara provoca enfrentamientos con la familia. Acostumbrada a la vida en su pueblo Sagrillas, no comparte la forma de vida de la familia de su hijo.', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, 'Con la frente marchita', 'Toda la familia espera con impaciencia la llegada a casa de Gerardo, un familiar que emigró a Argentina hace muchos años, y que esta de vuelta por unos días en España gracias a lo que se llamo Operación España.', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, 'Los caudillos también se rascan', 'Carlos queda impresionado cuando el cura Eugenio le hace tomar conciencia sobre el respeto a los animales. El menor de los Alcántara lleva al extremo su reciente condición de defensor de los animales y deja de cazar bichos.', 2);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (1, 'A las puertas del edén', 'Comienzan los vertiginosos años setenta para la familia Alcántara, con atisbos de cambio en el horizonte. El barrio de San Genaro anda revolucionado por la apertura de un nuevo local, el Edén, nada mas y nada menos que una barra americana.', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (2, 'París, ¡Oh la la!', 'Mercedes ultima los preparativos para irse a París. Sin embargo, todo parece ponerse manga por hombro antes del viaje. La barra americana El Edén deja su poso de desconfianza en la casa de los Alcántara.', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (3, 'Arde París', 'Mercedes y Nieves viven intensamente su estancia en París, cuyos aires de libertad poco tienen que ver con la España de 1970. Entre desfile y desfile conocen a Asunción Riaño, una elegante modista española.', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (4, 'La larga noche del maletín', 'El viaje a París llega a su fin, pero Nieves esta dispuesta a disfrutar hasta el último instante. Y es que, para ella, los franceses son la pera limonera. Mercedes asiste preocupada a los devaneos de su amiga.', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, 'Área de castigo', 'Llegan días de reencuentro a la casa de los Alcántara. Para alegría de toda la familia, por fin llega Mercedes de París, con su nuevo y elegante aspecto, y con muchos proyectos en la cabeza. Por su parte, Inés esta a punto de terminar la tourne.', 3);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (1, 'El hombre cansado', 'Antonio va a visitar a Don Pablo a la cárcel. Han pasado varios meses desde el hundimiento de la constructora pero Antonio no levanta cabeza. Vestido en su viejo uniforme de ordenanza, vuelve a trabajar por las mañanas en el ministerio.', 4);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (2, 'Besos de hippies', 'La llegada de Mike, con toda la filosofía hippie que trae consigo, hace mella en Inés que, en su eterna búsqueda, encuentra un mundo que explorar. Esto no pasa desapercibido ni para su madre ni para Eugenio, que temen que Inés vuelva a enamorarse.', 4);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (3, 'Made in USA', 'La oferta de Don Pablo para invertir en Meyni deja sumida en un mar de dudas a Mercedes, que bastantes problemas tiene ya con la actitud de Antonio y la marcha de su hija Inés a Ibiza.', 4);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (4, 'Femenino plural', 'Mercedes tiene la determinación de ir a buscar a Inés a Ibiza para traérsela de vuelta. Sin embargo, Antonio cree conocer bien a su hija y está convencido de que enseguida se cansará de Mike y volverá.', 4);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, 'Paraísos y purgatorios', 'Antonio y Mercedes llegan a Ibiza en busca de su hija y lo primero que les sorprende es la cantidad de hippies que hay en la isla y lo bien que se llevan con los ibicencos. Después de dar muchas vueltas, por fin encuentran a Inés.', 4);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (6, 'Elecciones orgánicas', 'Antonio y Mercedes llegan de Ibiza sin Inés, y prefieren ocultar la verdad a Herminia para no hacerla sufrir. Nada más llegar se encuentran con la noticia de que Don Pablo ha aceptado las condiciones de Merche para invertir.', 4);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (7, 'Los tiempos cambian', 'Don Pablo al fin enseña a sus nuevas socias las oficinas del Grupo Ramírez Sañudo (GRS), desde donde van a dirigir la nueva marca de moda Meyni. Antonio, que tiene que visitar varias boutiques con Desi como ayudante, está muy angustiado.', 4);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (1, 'Un orden nuevo', 'El pequeño de los Alcántara recuerda todo lo que les ha sucedido a él y a los suyos en los últimos meses, desde que Antonio trabajaba en el Ministerio y Mercedes se las veía y se las deseaba para sacar adelante a la familia.', 5);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (2, 'El año de la crisis', 'El primer año de la década de los setenta, 1971, trajo bajo el brazo una recesión económica que afectó a muchos países, entre ellos, España.', 5);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (3, 'Camino de santidad', 'Mercedes sigue muy preocupada por la marcha de Meyni. Ante la amenaza de quiebra y la lluvia de letras devueltas por el banco, Merche intenta cobrar los pedidos por su cuenta, lo que provoca el enfado de Antonio.', 5);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (4, 'La mujer ideal', 'El despido de Desi ha terminado por agotar la paciencia de Antonio. Cansado de no pintar nada en Meyni, se plantea muy seriamente aceptar la oferta de Don Pablo para trabajar con él en sus negocios de importación y exportación con la Unión Sovietica.', 5);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (5, 'Ochi chornia', 'El desmayo que sufrió hace unos días Herminia trae a los Alcántara por la calle de la amargura. La abuela se pasa el día de un humor de perrros pensando en comida, y es que el médico le ha ordenado seguir una dieta muy estricta.', 5);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (6, 'Hello Moscú: Vodka con martini', 'Por fin llega el día en que Don Pablo y Antonio se marchan a Moscú, lo cual era poco menos que viajar a la Luna, en una época en que los pasaportes permitían viajar a cualquier parte del mundo menos a la Unión Soviética, y países satélites', 5);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (7, 'La primavera la sangre altera', 'Después del pequeño contratiempo en la aduana, Antonio al fin llega a casa con regalos para toda la familia. Sin embargo, sus problemas con Mercedes siguen en el mismo punto donde los dejaron. Para aliviar tensiones, Antonio planea ir al cine.', 5);
insert into episodio (n_episodio, titulo, descripcion, n_temp)
values (8, 'Fe, esperanza y caridad', 'En la misa del domingo, Eugenio anuncia a sus feligreses que el arzobispado le ha ordenado abandonar su puesto en la parroquia para encomendarle otras tareas. Para sustituirle llega Froilán, un sacerdote con un talante más conservador.', 5);


--! PERSONAJE !--


create table personaje (
    id_personaje bigint not null identity(1, 1) primary key,
    nombre varchar(100) not null,
    descripcion varchar(max) not null,
    sexo varchar(20) not null,
    ocupacion varchar(50) not null, 
    nacionalidad varchar(100) not null,
    constraint perso_unq_01 unique (nombre)
);

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('Mercedes Alcántara', 'Madre de familia preocupada por el bienestar de sus hijos y esposa de Antonio Alcántara.', 'Femenino', 'Ama de casa', 'Española');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Antonio Alcántara', 'Padre de familia y esposo de Mercedes. Trabaja como administrativo y es un hombre comprometido con su familia y sus ideales.', 'Masculino', 'Administrativo', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Carlos Alcántara', 'El hijo mayor de la familia Alcántara. A lo largo de la serie, pasa por diferentes etapas de su vida, desde su juventud rebelde hasta su madurez.', 'Masculino', 'Variado (desde estudiante hasta empresario)', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Inés Alcántara', 'Hija de Mercedes y Antonio Alcántara. A lo largo de la serie, Inés experimenta diversos cambios en su vida, desde sus estudios hasta su vida sentimental.', 'Femenino', 'Variado (desde estudiante hasta empleada)', 'Española');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Toni Alcántara', 'El hijo menor de la familia Alcántara. A lo largo de la serie, enfrenta diferentes desafíos personales y profesionales, mostrando su evolución a lo largo de los años.', 'Masculino', 'Variado (desde estudiante hasta profesional)', 'Español');
insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad) 
values ('Herminia López', 'Esposa de Miguel Alcántara y madre de Carlos, Inés y Toni Alcántara. Mujer trabajadora y preocupada por su familia.', 'Femenino', 'Ama de casa', 'Española');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Miguel Alcántara', 'Esposo de Herminia López y padre de Carlos, Inés y Toni Alcántara. Trabaja como ferroviario y es un hombre de principios.', 'Masculino', 'Ferroviario', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Pablo López', 'Hijo de Herminia y Miguel Alcántara, hermano de Carlos, Inés y Toni. Tiene una personalidad inquieta y lucha por sus ideales.', 'Masculino', 'Estudiante', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Merche Gómez', 'Amiga de la familia Alcántara y vecina de los Gómez. A lo largo de la serie, desarrolla una estrecha relación con Mercedes Alcántara.', 'Femenino', 'Ama de casa', 'Española');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Eugenio', 'Amigo de Antonio Alcántara y compañero de trabajo. Es un personaje carismático que a menudo acompaña a Antonio en sus aventuras.', 'Masculino', 'Variado (trabaja en una fábrica)', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Nieves Gómez', 'Hija de los vecinos de los Alcántara, los Gómez. A lo largo de la serie, mantiene una relación especial con los hijos de Mercedes y Antonio.', 'Femenino', 'Estudiante', 'Española');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Desi', 'Amiga de la familia Alcántara y compañera de Inés. A lo largo de la serie, vive diversas experiencias junto a los Alcántara.', 'Femenino', 'Estudiante', 'Española');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Felipe', 'Amigo de Carlos Alcántara y compañero de trabajo en la agencia de publicidad. A lo largo de la serie, comparten momentos tanto profesionales como personales.', 'Masculino', 'Publicista', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Lola', 'Esposa de Felipe y amiga de los Alcántara. A lo largo de la serie, muestra su apoyo a Mercedes y la familia en diferentes situaciones.', 'Femenino', 'Ama de casa', 'Española');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Quico', 'Amigo de Carlos Alcántara y compañero de trabajo en la agencia de publicidad. A lo largo de la serie, comparten momentos de diversión y también desafíos.', 'Masculino', 'Publicista', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Josele', 'Amigo de Carlos Alcántara y compañero de trabajo en la agencia de publicidad. A lo largo de la serie, comparten momentos de amistad y complicidad.', 'Masculino', 'Publicista', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Eladio', 'Vecino y amigo de la familia Alcántara. A lo largo de la serie, comparte momentos de confidencias y risas con Antonio y Mercedes.', 'Masculino', 'Jubilado', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Don Pablo', 'Padre de Antonio Alcántara. Aparece en flashbacks y recuerdos de la infancia de Antonio, mostrando su influencia en su vida.', 'Masculino', 'Empresario', 'Español');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('Doña Herminia', 'Madre de Antonio Alcántara. Aparece en flashbacks y recuerdos de la infancia de Antonio, mostrando su papel en la familia.', 'Femenino', 'Ama de casa', 'Española');

insert into personaje (nombre, descripcion, sexo, ocupacion, nacionalidad)
values ('María Alcántara', 'Hija de Carlos Alcántara. Representa a la siguiente generación de la familia Alcántara y vive sus propias experiencias.', 'Femenino', 'Estudiante', 'Española');


--! PERSONAJE-EPISODIO !--



create table personaje_episodio (
    id_episodio bigint not null,
    id_personaje bigint not null,
    constraint epiperso_unq_01 unique (id_episodio, id_personaje),
    constraint epiperso_fk_01 foreign key (id_episodio) references episodio(id_episodio),
    constraint epiperso_fk_02 foreign key (id_personaje) references personaje(id_personaje)
);



--! ACTOR !--


create table actor (
    id_actor bigint not null  identity(1, 1) primary key,
    id_personaje bigint not null,
    nombre varchar(100) not null,
    nacionalidad varchar(100) not null,
    fecha_nacimiento Date not null,
    sexo varchar(20) not null,
    lugar_nacimiento varchar(50) not null,
    constraint actor_fk_01 foreign key (id_personaje) references personaje(id_personaje)
);

-- Mercedes Alcántara (Ana Duato)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (1, 'Ana Duato', 'Española', '1968-06-18', 'Femenino', 'Valencia, España');

-- Antonio Alcántara (Imanol Arias)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (2, 'Imanol Arias', 'Español', '1956-04-26', 'Masculino', 'Riaño, España');

-- Carlos Alcántara (Ricardo Gómez)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (3, 'Ricardo Gómez', 'Español', '1994-02-25', 'Masculino', 'Talavera de la Reina, España');

-- Inés Alcántara (Irene Visedo)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (4, 'Irene Visedo', 'Española', '1978-07-14', 'Femenino', 'Madrid, España');

-- Toni Alcántara (Pablo Rivero)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (5, 'Pablo Rivero', 'Español', '1981-04-30', 'Masculino', 'Zaragoza, España');

-- Herminia López (María Galiana)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (6, 'María Galiana', 'Española', '1935-05-31', 'Femenino', 'Sevilla, España');

-- Miguel Alcántara (Imanol Arias)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (7, 'Imanol Arias', 'Español', '1956-04-26', 'Masculino', 'Riaño, España');

-- Pablo López (Santiago Crespo)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (8, 'Santiago Crespo', 'Español', '1976-01-28', 'Masculino', 'Valencia, España');

-- Merche Gómez (Ana Duato)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (9, 'Ana Duato', 'Española', '1968-06-18', 'Femenino', 'Valencia, España');

-- Eugenio (Fernando Tielve)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (10, 'Fernando Tielve', 'Español', '1983-07-18', 'Masculino', 'Madrid, España');

-- Nieves Gómez (Irene Visedo)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (11, 'Irene Visedo', 'Española', '1978-07-14', 'Femenino', 'Madrid, España');

-- Desi (Carmen Climent)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (12, 'Carmen Climent', 'Española', '1996-02-13', 'Femenino', 'Bilbao, España');

-- Felipe (Quim Gutiérrez)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (13, 'Quim Gutiérrez', 'Español', '1981-03-27', 'Masculino', 'Barcelona, España');

-- Lola (Adriana Ozores)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (14, 'Adriana Ozores', 'Española', '1959-05-21', 'Femenino', 'Madrid, España');

-- Quico (Álvaro de Luna)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (15, 'Álvaro de Luna', 'Español', '1935-10-10', 'Masculino', 'Madrid, España');

-- Josele (Fernando Soto)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (16, 'Fernando Soto', 'Español', '1968-10-18', 'Masculino', 'Madrid, España');

-- Eladio (Manolo Cal)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (17, 'Manolo Cal', 'Español', '1948-03-05', 'Masculino', 'Madrid, España');

-- Don Pablo (Ramón Langa)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (18, 'Ramón Langa', 'Español', '1959-09-24', 'Masculino', 'Madrid, España');

-- Doña Herminia (Empar Ferrer)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (19, 'Empar Ferrer', 'Española', '1935-05-07', 'Femenino', 'Barcelona, España');

-- María Alcántara (Lucía Martín Abello)
insert into actor (id_personaje, nombre, nacionalidad, fecha_nacimiento, sexo, lugar_nacimiento)
values (20, 'Lucía Martín Abello', 'Española', '1993-04-13', 'Femenino', 'Madrid, España');
