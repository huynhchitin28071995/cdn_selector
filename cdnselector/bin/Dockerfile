FROM maven:3.6.3-jdk-11-openj9 AS install
# VOLUME ./m2 /root/.m2/
# COPY ./ /tmp/dns-service
WORKDIR /tmp/cdn-selector
ADD pom.xml /tmp/cdn-selector
RUN ["/usr/local/bin/mvn-entrypoint.sh", "mvn", "verify", "clean", "--fail-never"]
ADD . /tmp/cdn-selector
RUN ["mvn", "package"]
EXPOSE 8080
CMD ["java", "-jar", "/tmp/cdn-selector/target/cdnselector-0.0.1-SNAPSHOT.jar"]

# RUN mvn install

# FROM maven:3.6.3-jdk-11-openj9 as build
# VOLUME ./m2 /root/.m2/
# COPY ./ /tmp/cdn-selector
# WORKDIR /tmp/cdn-selector
# RUN mvn package && chmod +X -R ./target

# FROM openjdk:11-jdk-alpine
# WORKDIR /tmp
# COPY --from=build /tmp/cdn-selector/target/cdnselector-0.0.1-SNAPSHOT.jar app.jar
# ENTRYPOINT ["java","-jar","/tmp/app.jar"]
