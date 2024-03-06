FROM gradle:8.6.0-jdk21 AS build
ADD build/libs/ gastroSmart.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","gastroSmart.jar"]
