FROM adoptopenjdk:11-hotspot
LABEL maintainer="moisesjose.alvaradougarriza@nttdata.com"
COPY target/bootcoin-bank-1.0.0.jar bootcoin-bank.jar
CMD ["java", "-jar", "bootcoin-bank.jar"]
EXPOSE 9958