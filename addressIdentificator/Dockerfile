FROM openjdk:latest

WORKDIR /app

COPY . /app/

RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip=true

EXPOSE 8080

ENTRYPOINT ["java", "-jar","/app/*.jar"]