FROM openjdk:8-jdk-alpine

COPY build/libs/openclassrooms_8th-project_rewardcentral-microservice-1.1.0-SNAPSHOT.jar /RewardCentral.jar

CMD ["java", "-jar", "/RewardCentral.jar"]
