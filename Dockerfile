FROM eclipse-temurin:17
WORKDIR /home
COPY ./flowers ./flowers
COPY ./target/Final-0.0.1-SNAPSHOT.jar Final.jar
ENTRYPOINT ["java", "-jar", "Final.jar"]