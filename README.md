# Basic Restful Service with Spring Web, JPA & H2 (Full)

Exercice 10 - https://spring.io/guides/tutorials/rest/

## Commands

- `./mvnw spring-boot:run` to run
- `./mvnw clean package` to build and then `java -jar target/spring-hateoas-employee-system-0.0.1-SNAPSHOT.jar --server.port=8080`

**Employees**
- View employees `http://localhost:8080/employees` (or using `curl -v localhost:8080/employees | json_pp pretty,canonical`)
- View an employee `http://localhost:8080/employees/1` (or using `curl -v localhost:8080/employees/1 | json_pp pretty,canonical`)
- Create `curl -v -X POST localhost:8080/employees -H 'Content-Type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'`
- Update `curl -v -X PUT localhost:8080/employees/3 -H 'Content-Type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'`
- Delete `curl -v -X DELETE localhost:8080/employees/1`

**Orders**
- View orders `http://localhost:8080/orders` (or using `curl -v localhost:8080/orders | json_pp pretty,canonical`)
- View an order `http://localhost:8080/orders/1` (or using `curl -v localhost:8080/orders/1 | json_pp pretty,canonical`)
- Cancel `curl -v -X DELETE http://localhost:8080/orders/4/cancel`
- Complete order `curl -v -X PUT localhost:8080/orders/4/complete`
