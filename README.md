# Spring Microservices Project

This project is a Spring Boot microservices application consisting of multiple services: Question Service, Quiz Service, Service Registry, and API Gateway. Each service runs on a different port and is designed to handle specific tasks within the application.

## Table of Contents

- [Services](#services)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Services

1. **Question Service** (Port: 8081)
   - Manages questions and related operations.

2. **Quiz Service** (Port: 8082)
   - Manages quizzes, including creation, updates, and deletions.

3. **Service Registry** (Port: 8761)
   - Eureka Service Registry for managing service instances.

4. **API Gateway** (Port: 8083)
   - Spring Cloud API Gateway for routing requests to the appropriate service.

## Technologies Used

- **Backend:** Spring Boot, Spring Cloud Netflix (Eureka, Zuul)
- **Database:** H2 (for simplicity, can be replaced with any other database)
- **Build Tool:** Maven

## Installation

### Prerequisites

- Java Development Kit (JDK 11 or higher)
- Maven
- Git

### Setup

1. Clone the repository:

    ```bash
    git clone https://git@github.com:asrinibash/Spring-Microservices.git
    cd spring-microservices-project
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

## Running the Application

### Start the Services

1. **Service Registry**

    ```bash
    cd serviceRegistry
    mvn spring-boot:run
    ```

2. **Question Service**

    ```bash
    cd ../questionService
    mvn spring-boot:run
    ```

3. **Quiz Service**

    ```bash
    cd ../quizService
    mvn spring-boot:run
    ```

4. **API Gateway**

    ```bash
    cd ../apiGateway
    mvn spring-boot:run
    ```

### Accessing the Services

- **Service Registry Dashboard:** `http://localhost:8761`
- **Question Service API:** `http://localhost:8081`
- **Quiz Service API:** `http://localhost:8082`
- **API Gateway:** `http://localhost:8083`

## Project Structure

