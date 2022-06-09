FROM adoptopenjdk:11-hotspot
LABEL maintainer="jugarriza10@gmail.com"
COPY target/bootcoin-bank-1.0.0.jar bootcoin-bank.jar
CMD ["java", "-jar", "bootcoin-bank.jar"]
EXPOSE 9958
