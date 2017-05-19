FROM openjdk:8-jdk-alpine
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/app.jar"]
# Add the service itself
ADD target/app-0.0.1-SNAPSHOT.jar /usr/share/myservice/app.jar