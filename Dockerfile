###
# Build stage
###
##
#FROM gradle:8.6.0-openjdk-21 AS build
#COPY src /home/app/src
###COPY pom.xml /home/app
###RUN mvn -f /home/app/pom.xml clean package
###EXPOSE 8080
#ENTRYPOINT ["java","-jar","/home/app/target/gastroSmart.jar"]
#
#
#
#
#

FROM gradle:8.6.0-jdk21 AS build
ADD build/libs/*.jar gastroSmart.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","gastroSmart.jar"]
