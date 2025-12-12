# new-qqq-application-template

Minimal QQQ starter project with a simple order-management domain (Customer, Product, Order, OrderLine), Liquibase migrations + seed data, mock auth, and the Material Dashboard served at `/`.

## Run locally (Postgres)
```bash
export RDBMS_VENDOR=postgresql
export RDBMS_HOSTNAME=localhost
export RDBMS_PORT=5432
export RDBMS_DATABASE_NAME=qqq_orders
export RDBMS_USERNAME=devuser
export RDBMS_PASSWORD=devpass

mvn liquibase:update
mvn clean package -DskipTests
java -jar target/new-qqq-application-template.jar
```
Open `http://localhost:8000/` for the dashboard and `http://localhost:8000/qqq-api/` for APIs.

## Tests (H2)
```bash
mvn test
```

## What’s included
- Working pom with QQQ BOM + Javalin middleware + Material Dashboard
- Liquibase schema + seed data under `src/main/resources/db/liquibase/`
- Sample metadata, entities, and a CreateOrder process under `src/main/java/com/example/orders`
- Mock authentication and branding defaults
