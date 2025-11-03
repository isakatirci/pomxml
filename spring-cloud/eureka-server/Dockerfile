FROM eclipse-temurin:24_36-jre-noble AS builder
WORKDIR /extracted
ADD ./target/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM eclipse-temurin:24_36-jre-noble
WORKDIR /application
COPY --from=builder /extracted/ ./

EXPOSE 8761

ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]
