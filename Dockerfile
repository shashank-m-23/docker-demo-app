FROM openjdk:17
COPY target/docker-demo-app.jar /spring-app/
WORKDIR /spring-app/
EXPOSE 8080 
ENTRYPOINT [ "java","-jar" ]
CMD ["docker-demo-app.jar"]