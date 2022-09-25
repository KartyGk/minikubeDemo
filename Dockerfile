FROM openjdk:8
EXPOSE 8081
ADD target/kubectldemo-image.jar kubectldemo-image.jar
ENTRYPOINT ["java","-jar","/kubectldemo-image.jar"]