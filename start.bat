@echo off
mvn clean install
CMD docker-compose up -d
pause
echo servicio activo