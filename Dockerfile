FROM maven
EXPOSE 8080
RUN mkdir mycode
ADD . mycode
WORKDIR  mycode
RUN mvn clean install
ENTRYPOINT ["java","-jar","target/LoginSignUp-0.0.1-SNAPSHOT.jar"]