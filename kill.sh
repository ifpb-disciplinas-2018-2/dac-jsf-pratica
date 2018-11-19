#!/usr/bin/env bash
docker kill app
docker rm app
docker rmi atividade/app
docker kill banco
docker rm banco
docker rmi atividade/banco

# docker rmi -f $(docker image ls atividade/* -q)
# docker kill $(docker container ls -a -q)
# docker rm banco
# docker rm app
