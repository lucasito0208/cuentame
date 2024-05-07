# Proyecto cuentame api REST

En este ejercicio, se te pide que crees una API REST utilizando la pila skeletor de la empresa.

El objetivo de este ejercicio es diseñar y desarrollar una API REST en Java para gestionar información relacionada con una serie de televisión. La serie tendrá una estructura básica que incluye temporadas, episodios, personajes y actores. Debes implementar las operaciones básicas de consulta para obtener información sobre la serie.

Requisitos Funcionales:

· Crear una entidad Temporada. Cada temporada tendrá un número de temporada y una lista de episodios.

· Crear una entidad Episodio que estará asociada a una Temporada. Cada episodio debe tener un título, una descripción y un número de episodio. Cada Episodio cuenta con un listado de personajes que aparecen en él.

· Crear una entidad Personaje que representará a los personajes de la serie. Cada personaje tendrá un nombre, una descripción y un listado de episodios donde aparece.

· Crear una entidad Actor que contendrá información sobre los actores, como nombre, fecha de nacimiento y nacionalidad. Cada actor tendrá una referencia al personaje que interpreta.

Operaciones a Implementar (WS a desarrollar en cada controlador):

· Consultar los detalles de una temporada, incluyendo la lista de episodios.

· Consultar el listado completo de episodios (2 endpoints):

o Sin filtro y sin paginar

o Con filtro y paginado. Se podrá filtrar por los siguientes campos:

§ Identificador de temporada

§ Título de episodio (texto contenido sin tener en cuenta mayúsculas y minúsculas)

§ Número de episodio

· Consultar los detalles de un episodio específico. Incluida lista de personajes que aparecen.

· Consultar la lista completa de personajes de la serie.

· Consultar los detalles de un personaje específico, incluyendo el actor o actores que lo interpretan.

· Consultar la lista de actores disponibles.

· Consultar los detalles de un actor específico, incluyendo su fecha de nacimiento y nacionalidad. Así como los detalles del personaje que interpretan.

Requisitos Técnicos:

Utiliza Java para desarrollar la API REST. En concreto se va a trabajar con la pila de la empresa llamada Skeletor. Con Spring Boot, para simplificar el desarrollo de la API. Tendréis disponible Swagger para la consulta y representación visual de dicha API, aunque también será utilizable desde software de terceros como postman o navegador.

Almacena la información de la serie, temporadas, episodios, personajes y actores en una base de datos implementada con docker. Recibiréis instrucciones en el plan formativo para ello.

Info Extra:

· Modelo de datos a crear por el desarrollador. Cada uno tendrá que diseñar y defender su modelo de datos. Se valorará positivamente un modelo de datos coherente y que satisfaga las necesidades de la API Rest en su conjunto. No obstante, una vez se hayan visto todos los modelos de datos que los compañeros propongáis se os proporcionara uno común para todos, para que todos tengáis el mismo.

· La API REST será consumida a modo de prueba desde el propio swagger de la pila o software comercial de terceros, tipo postman.

· Se valorará un buen resultado de métricas en sonar.

· Si finalizas pronto lo propuesto básico, puedes hacer crecer tu API tanto como quieras y consideres oportuno, se valorará positivamente.