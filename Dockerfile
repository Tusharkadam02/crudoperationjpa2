FROM openjdk:11

COPY target/crudoperationjpa2-0.0.1-SNAPSHOT.jar crudoperationjpa2.jar

ENTRYPOINT ["java","-jar","crudoperationjpa2.jar"]

Expose 8081