# Prueba Técnica Developer

Esta prueba fue desarrollada por Joshua Triana para avanzar en el proceso laboral en la empresa Parameta

## Proyecto Spring

El proyecto fue desarrollado en spring boot. La estructura general del proyecto es la siguiente:

- En el paquete com.parameta esta el archivo principal de ejecución
- En el paquete com.parameta.controlador esta el archivo controlador del api con los endpoints de consulta y creación, ademas de un archivo manejador de errores para desplegar de mejor manera los mensajes de advertencia por las validaciones no pasadas
- En el paquete com.parameta.modelos esta el archivo entidad principal del empleado, ademas de una clase auxiliar para el manejo de las llaves compuestas (Tipo de documento y Número de documento
- En el paquete com.parameta.modelos esta el archivo entidad principal del empleado, ademas de una clase auxiliar para el manejo de las llaves compuestas (Tipo de documento y Número de documento
- En el paquete com.parameta.repositorio esta el repositorio para el crud de los empleados
- En el paquete com.parameta.validacion estan los archivos donde se hicieron las validaciones personalizadas para la mayoría de edad

## Notas

- Consultar la configuración del archivo pom.xml para las dependencias
- Consultar la configuración del proyecto en el archivo application.propierties
- El backup de la base de datos esta en el archivo parameta.sql
- Se desarrollaron pruebas en postman para comprobar el funcionamiento de la api. En este enlace se puede consultar la configuración para replicar: <https://www.postman.com/collections/39628ce1c875326eae61>
