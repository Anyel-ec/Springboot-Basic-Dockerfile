# Imagen base con JDK 17
FROM openjdk:17-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el JAR al contenedor
COPY app.jar .

# Exponer el puerto de la aplicación
EXPOSE 8080

# Comando de inicio para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
