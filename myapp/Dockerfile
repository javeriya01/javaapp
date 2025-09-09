FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /myapp
COPY pom.xml .
COPY src ./src
RUN mvn -B -DskipTests clean package

# ---------- runtime stage ----------
FROM eclipse-temurin:17-jre-jammy
WORKDIR /myapp
# copy jar produced by build stage (adjust name if different)
COPY --from=build /myapp/target/*.jar myapp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/myapp/myapp-0.0.1-SNAPSHOT.jar"]
