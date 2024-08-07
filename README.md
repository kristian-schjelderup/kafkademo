# Kafkademo

A small Java SpringBoot based application using Kafka to produce and consume a message 
with JSON payload.

### Prerequisites

Install Confluent CLI from here: https://docs.confluent.io/confluent-cli/current/install.html

## Usage

### 1. Start a local kafka broker through the use of Confluent CLI

```shell
confluent local kafka start
```

Take note of the port used by Kafka broker as it starts up.

### 2. Run application

First modify `src/main/resources/applicatipn.properties` with correct port

Then start application

```shell
./gradlew bootRun
```

### 3. Send some message

The application has a REST API to publish messages.

```shell
curl -XPOST "http://localhost:8080/send?message=test"
```

#### 4. Watch output

The output from the application will list received messages.
