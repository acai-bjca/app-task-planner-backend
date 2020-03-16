### Task Planner - BackEnd

En este repositoro se encuentran la implementación del backend de la aplicación app-task-planner que es consumido por el repositorio app-task-planner-frontEnd.

Ejecutar el proyecto:

    1. Clone el repositorio app-task-planner-frantEnd en la rama lab-2.1-backend:
    https://github.com/acai-bjca/app-task-planner-frontEnd/tree/lab-2.1-backend

    2. Clone este repositorio (app-task-planner-backend):
    https://github.com/acai-bjca/app-task-planner-backend.git

    3. Compile y e jecute el repositorio app-task-planner-frantEndr: 
        mvn clean compile
        mvn package
        mvn spring-boot: run

    3. Luego instale y ejecute app-task-planner-backend: 
        npm install
        npm start

    4. Para verificar ingrese a Firefox (requiere de una extensión - leer enunciado del laboratorio) y navegue por la aplicación.
        Cree una cuenta
        Inicie sesión
        Verifique que se muestren tareas, las cuales son traídas desde el backend

  Link enunciado:

 #### 2.1 API del planificador de tareas:

 https://github.com/ieti-eci/2.1-task-planner-api

 Se implementaron los servicios Tasks y Users.
 
 app-task-planner consume de app-task-planner2, Actualmente se pueden mostrar las tareas disponibles en el backend.


