FROM java:8
ADD target/SpringBootApp.jar SpringBootApp.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","SpringBootApp.jar"] 