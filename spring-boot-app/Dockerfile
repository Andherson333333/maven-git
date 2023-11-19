
FROM adoptopenjdk/openjdk11
#ARG artifact=target/spring-boot-web.jar
WORKDIR /opt/app
COPY *.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
