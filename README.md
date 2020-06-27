# API_Eventos
API con Spring Boot y MySQL
## Descripción 
El siguiente proyecto es una API desarrollada con el framework Spring Boot y utilizando MySQL como gestor de base de datos 
El objetivo de la API es gestionar eventos, localidades y la relación que se puede generar entre ellos. 
### Se utilizó: 
```
-NetBeans 12.0 como IDE 
-Spring Boot v2.3.1
-MySQL v8.0.16
-JDK 14 
```
## Comenzando 
Pasos para correr la API: 
```
-Descargar el contenido del repositorio y abrir el proyecto (Eventos) en NetBeans. 
-Realizar acción CLEAN & BUILD para descargar las dependencias necesarias 
-Cargar Base de Datos mediante el script(dbscript.sql ubicado en la carpeta DB) o mediante MySQL WorkBench utilizando el modelo(modeloAPIdb.mwb también incluido en la carpeta DB) 
-Dentro del proyecto realizar la configuración del archivo application.properties con las credenciales de la base de datos y la dirección de la base de datos (las credenciales del usuario utilizado al desarrollar la API se encuentran en la carpeta DB)
```
## Documentacion 
```
Para la documentación se implementó la GUI Swagger, que nos permite visualizar cada endpoint, así como los response que estos generan y la estructura JSON del request que solicitan. 
Se puede acceder a la misma desde la dirección (cuando la API está corriendo):  http://localhost:8080/swagger-ui.html
```
