# prod-hack-backend

#### Back end service for todo application

## Getting Started

These instructions will give you a copy of the project up and running on
your local machine for development and testing purposes. See deployment
for notes on deploying the project on a live system.

### Prerequisites

Requirements for the software and other tools to build, test and push
- [Java 16](https://docs.aws.amazon.com/corretto/latest/corretto-16-ug/downloads-list.html)

### Run Locally
1. Modify 'spring.datasource.password' within '/src/main/resources/application.properties' with
    password sent from admin
2. Enter the following command from the project root directory:
    ```bash
    ./gradlew bootRun
    ```
   
#### Recourses:

Getting started: https://spring.io/guides/gs/rest-service/

Help with Controllers: https://www.geeksforgeeks.org/how-to-create-a-rest-api-using-java-spring-boot/

Connecting to db: https://medium.com/swlh/java-spring-getting-started-with-java-backend-api-development-debafa1937d2

Connection to db errors: https://stackoverflow.com/questions/63222401/how-to-connect-postgresql-in-gradle-project

JPA: https://www.educba.com/java-repository/,
https://spring.io/projects/spring-data-jpa

Understanding JPA & DAO: https://www.baeldung.com/java-dao-pattern, https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa

psql fk: https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-foreign-key/

cors: https://spring.io/guides/gs/rest-service-cors/