FROM openjdk:8
ADD target/studentdemo.jar studentdemo.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "studentdemo.jar"]