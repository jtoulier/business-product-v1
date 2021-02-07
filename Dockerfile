FROM openjdk:11-jre
COPY ./target/business-product-v1-0.0.1-SNAPSHOT.jar /opt/business-product-v1.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8", "-jar", "/opt/business-product-v1.jar"]