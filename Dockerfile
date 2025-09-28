# Imagen ligera con alpine
FROM eclipse-temurin:21-jre-alpine

# Crear usuario sin privilegios root por seguridad
RUN addgroup -S spring && adduser -S spring -G spring

# Directorio de trabajo
WORKDIR /app

# Copiar el JAR generado por Spring Boot
COPY target/terremoto-kafka-0.0.1-SNAPSHOT.jar app.jar

# Asignar permisos al JAR
RUN chown spring:spring app.jar

# Cambiar al usuario no root
USER spring:spring

# Exponer el puerto en el que escucha la aplicación
EXPOSE 8080

# Comando de inicio
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
