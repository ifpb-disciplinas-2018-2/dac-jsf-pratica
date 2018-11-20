#!/usr/bin/env bash
sudo docker kill app
sudo docker rm app
sudo docker rmi atividade/app
sudo docker kill banco
sudo docker rm banco
sudo docker rmi atividade/banco

# docker rmi -f $(docker image ls atividade/* -q)
# docker kill $(docker container ls -a -q)
# docker rm banco
# docker rm app
