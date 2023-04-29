# api-countries-codes

1.Clone this repository: git clone https://github.com/Marc0Franc0/api-countries-codes.git
2.Navigate to the folder: cd api-countries-codes

## Requirements

For building and running the application you need:

- [JDK 20](https://www.oracle.com/java/technologies/downloads/#java20)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

Using Docker -> navigate to: [http://localhost:9090/](http://localhost:9090/) :

```shell
docker compose up -d --build
```

