
FROM gradle:8.6.0-jdk17 AS build
#ADD build/libs/gastroSmart-0.0.1-SNAPSHOT.jar gastroSmart.jar
ADD build/libs/*.jar ./
EXPOSE 8080
ENTRYPOINT ["java","-jar","gastroSmart-0.0.1-SNAPSHOT.jar"]
