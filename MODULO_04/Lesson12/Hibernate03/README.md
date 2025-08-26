# Proyecto Hibernate con JDK 17

Este proyecto utiliza Hibernate para la interacción con la base de datos y está diseñado para ser ejecutado con **JDK 17**. Sigue los pasos a continuación para compilar y ejecutar el proyecto correctamente.

## Pasos para compilar y ejecutar

1. **Asegúrate de que estás usando JDK 17**  
   Verifica que tu entorno tiene configurado JDK 17. Puedes comprobar tu versión de Java ejecutando lo siguiente en la terminal:
   ```bash
   java -version
   ```
   Si no tienes JDK 17 instalado, descárgalo desde el sitio oficial de [Oracle](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) o usa un gestor de JDK como SDKMAN.

2. **Limpia e instala el proyecto usando Maven**  
   Ejecuta los siguientes comandos en la raíz del proyecto:
   ```bash
   mvn clean install
   ```
   Esto asegurará que todas las dependencias estén correctamente descargadas y que el proyecto esté listo para ejecutarse.

## Consideraciones

- Asegúrate de tener configurado Maven correctamente. Si no tienes Maven instalado, sigue las instrucciones en [Maven Download](https://maven.apache.org/download.cgi).
- El archivo de configuración de Hibernate (`hibernate.cfg.xml`) debe incluir los parámetros correctos para conectarse a tu base de datos.

¡Eso es todo! El proyecto está listo para ser compilado y ejecutado.