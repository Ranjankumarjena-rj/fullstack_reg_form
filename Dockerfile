FROM eclipse-temurin:17-jre-jammy
EXPOSE 8095
ADD target/saroj-fullstack-project-0.0.1-SNAPSHOT.jar saroj-fullstack-project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/saroj-fullstack-project-0.0.1-SNAPSHOT.jar"]
