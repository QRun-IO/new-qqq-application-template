# new-qqq-application-template

Starter template for new QQQ applications.

**For:** Developers starting a new QQQ project from scratch  
**Status:** Stable

## Why This Exists

Starting a QQQ application requires boilerplate: Maven configuration, entity definitions, database migrations, authentication setup, and dashboard integration. This template provides a working starting point with a simple order-management domain.

## What's Included

- **Sample Entities** - Customer, Product, Order, OrderLine
- **Database Migrations** - Liquibase schema and seed data
- **Authentication** - Mock auth for development
- **Dashboard** - Material Dashboard served at `/`
- **API** - REST endpoints at `/qqq-api/`

## Quick Start

### Prerequisites

- Java 21+
- Maven 3.8+
- PostgreSQL (or use included Docker setup)

### Clone and Customize

```bash
# Clone template
git clone https://github.com/QRun-IO/new-qqq-application-template.git my-app
cd my-app

# Customize package names and metadata
python3 scripts/customize_template.py

# Build
mvn clean package -DskipTests
```

### Start Database

```bash
# Using Docker
docker compose -f src/test/resources/postgres/docker-compose.yml up -d

# Or use existing PostgreSQL
export RDBMS_HOSTNAME=localhost
export RDBMS_PORT=5432
export RDBMS_DATABASE_NAME=qqq_orders
export RDBMS_USERNAME=devuser
export RDBMS_PASSWORD=devpass
```

### Run Application

```bash
# Apply migrations
mvn liquibase:update

# Start server
java -jar target/new-qqq-application-template.jar
```

Open `http://localhost:8000/` for the dashboard.

## Usage

### Environment Variables

| Variable | Default | Description |
|----------|---------|-------------|
| `RDBMS_VENDOR` | postgresql | Database type |
| `RDBMS_HOSTNAME` | localhost | Database host |
| `RDBMS_PORT` | 5432 | Database port |
| `RDBMS_DATABASE_NAME` | qqq_orders | Database name |
| `RDBMS_USERNAME` | devuser | Database user |
| `RDBMS_PASSWORD` | devpass | Database password |

### Running Tests

```bash
# Uses H2 in-memory database
mvn test
```

### Adding Entities

1. Create entity class in `src/main/java/<package>/entity/`
2. Add Liquibase migration in `src/main/resources/db/liquibase/`
3. Register entity in MetaProvider

### Adding Processes

1. Create process class in `src/main/java/<package>/process/`
2. Implement `BackendStep` interface
3. Register process in MetaProvider

## Configuration

### Database

Migrations are in `src/main/resources/db/liquibase/`. Add new changesets for schema changes.

### Authentication

Mock auth is configured for development. Replace with your auth provider for production.

### Branding

Update `src/main/resources/` for logos and styling.

## Project Status

Stable template. Updated with each QQQ release.

## Contributing

1. Fork the repository
2. Create a feature branch
3. Submit a pull request

## License

Proprietary - QRun.IO
