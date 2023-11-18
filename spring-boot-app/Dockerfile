
FROM adoptopenjdk/openjdk11
ARG artifact=spring-boot-app/spring-boot-demo-1.0.jar
WORKDIR /opt/app
COPY ${artifact} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
