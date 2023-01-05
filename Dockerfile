FROM openjdk:8
EXPOSE 8080
ARG JAR_FILE=target/Product-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} Product-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Product-0.0.1-SNAPSHOT.jar"]