 [![CI/CD Pipeline](https://github.com/restrepotorres/laboratorio2ArquitecturaSoftware/actions/workflows/build.yml/badge.svg)](https://github.com/restrepotorres/laboratorio2ArquitecturaSoftware/actions/workflows/build.yml)
 [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=RestrepoTorres_laboratorio2ArquitecturaSoftware&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=RestrepoTorres_laboratorio2ArquitecturaSoftware)
 [![Bugs](https://sonarcloud.io/api/project_badges/measure?project=RestrepoTorres_laboratorio2ArquitecturaSoftware&metric=bugs)](https://sonarcloud.io/summary/new_code?id=RestrepoTorres_laboratorio2ArquitecturaSoftware)
 [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=RestrepoTorres_laboratorio2ArquitecturaSoftware&metric=coverage)](https://sonarcloud.io/summary/new_code?id=RestrepoTorres_laboratorio2ArquitecturaSoftware)
 [![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=RestrepoTorres_laboratorio2ArquitecturaSoftware&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=RestrepoTorres_laboratorio2ArquitecturaSoftware)
 [![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=RestrepoTorres_laboratorio2ArquitecturaSoftware&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=RestrepoTorres_laboratorio2ArquitecturaSoftware)
 [![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=RestrepoTorres_laboratorio2ArquitecturaSoftware&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=RestrepoTorres_laboratorio2ArquitecturaSoftware)
 
# laboratorio2ArquitecturaSoftware

### Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random aviation
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```
