FROM openjdk:24-jdk-bookworm
WORKDIR home
COPY build/libs/transaction_interceptor-0.0.1-SNAPSHOT.jar /home/transaction_interceptor.jar
CMD ["java", "-jar", "/home/transaction_interceptor.jar"]
