FROM openjdk:8
EXPOSE 8082
ADD target/kubectldemo-image.jar kubectldemo-image.jar
ENTRYPOINT ["java","-jar","/kubectldemo-image.jar"]