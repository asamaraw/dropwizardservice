# Dropwizard Service

[![Build Status](https://github.com/asamaraw/dropwizardservice/actions/workflows/build.yml/badge.svg)](https://github.com/asamaraw/dropwizardservice/actions)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A modern, production-ready web service built with Dropwizard, providing robust and scalable API endpoints.

## Features

- RESTful API endpoints
- Database integration with Hibernate
- Built-in metrics and health checks
- Configuration management
- Request/Response logging
- Input validation
- Unit and integration testing

## Prerequisites

- Java 17 or higher
- Gradle 8.0 or higher
- Docker (optional, for containerized deployment)
- PostgreSQL (or your preferred database)

## Getting Started

### Build the Project

```bash
# Clone the repository
git clone https://github.com/asamaraw/dropwizardservice.git
cd dropwizardservice

# Build the project
./gradlew build
```

### Configuration

1. Copy the example configuration file:
   ```bash
   cp config.yml.example config.yml
   ```

2. Update `config.yml` with your database and application settings.

### Running the Application

```bash
# Run the application
./gradlew run

# Or build and run the fat JAR
./gradlew build
java -jar build/libs/dropwizardservice-1.0-SNAPSHOT.jar server config.yml
```

The service will be available at `http://localhost:8080` by default.

## API Documentation

Once the service is running, you can access:

- **Swagger UI**: `http://localhost:8080/swagger`
- **Health Check**: `http://localhost:8081/healthcheck`
- **Metrics**: `http://localhost:8081/metrics`

## Development

### Code Style

This project uses [Google Java Format](https://github.com/google/google-java-format) for code style consistency.

To format code:
```bash
./gradlew spotlessApply
```

### Testing

```bash
# Run unit tests
./gradlew test

# Run integration tests
./gradlew integrationTest

# Run all tests
./gradlew check
```

### Building a Docker Image

```bash
./gradlew jibDockerBuild --image=dropwizardservice:latest
```

## Deployment

### Prerequisites
- Docker and Docker Compose

### Using Docker Compose

```bash
docker-compose up -d
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a pull request

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Dropwizard](https://www.dropwizard.io/)
- [Gradle](https://gradle.org/)
- [Hibernate](https://hibernate.org/)
- [JUnit 5](https://junit.org/junit5/)
- [TestContainers](https://www.testcontainers.org/)

