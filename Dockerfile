FROM openjdk:8
ADD target/mystudentdocker.jar mystudentdocker.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "mystudentdocker.jar"]