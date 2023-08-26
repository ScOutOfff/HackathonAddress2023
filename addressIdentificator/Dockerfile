# Ничего не трогать, перейти в файл docker-compose.yml

FROM openjdk:latest

WORKDIR /app

COPY target/*.jar address-indentificator.jar

CMD ["java","-jar","address-indentificator.jar"]