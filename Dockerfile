FROM openjdk:8-alpine
COPY /target/SPEAssignment-1.0-SNAPSHOT.jar /home/SPEAssignment-1.0-SNAPSHOT.jar
CMD ["java","-jar","/home/SPEAssignment-1.0-SNAPSHOT.jar"]
