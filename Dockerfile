#FROM payara/server-full
#FROM payara/server-web

FROM payara/micro
COPY /target/docker-jsf-atividade.war ${DEPLOY_DIR}
