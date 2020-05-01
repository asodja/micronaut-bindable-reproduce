FROM openjdk:14-alpine
COPY build/libs/micronaut-bindable-reproducer-*-all.jar micronaut-bindable-reproducer.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-bindable-reproducer.jar"]
