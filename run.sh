#!/usr/bin/env bash
sudo docker build -t atividade/banco ./postgres
sudo docker run -p 5433:5432  --name banco  -d atividade/banco 
mvn clean package
sudo docker build -t atividade/app .
sudo docker run -p 8082:8080 --name app --link banco:host-banco -d atividade/app 

