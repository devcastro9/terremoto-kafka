# Léeme primero

Este proyecto utiliza **Spring Boot**, **Apache Kafka**, **Apache Kafka Raft (sin ZooKeeper)**, **Maven** y **Docker** para su construcción y ejecución.  
A continuación se detallan los pasos necesarios para levantar el entorno.

---

## 🚀 Pasos para ejecutar el proyecto

1. **Compilar el proyecto con Maven**  
  
   ```bash
   ./mvnw clean package -DskipTests

2. **Construir el contenedor**
   ```bash
   docker-compose build

3. **Ejecutar el contendor**  

   ```bash
   docker-compose up -d
