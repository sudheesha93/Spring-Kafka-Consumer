# Spring-Kafka-Consumer
This Project covers how to use Spring Boot with Spring Kafka to Publish JSON/String message to a Kafka topic

* Create a spring boot project with Kafka as a dependency
* Download the kafka binary file on to your system

      https://kafka.apache.org/downloads (download the binary not the source)
* To CONSUME some random data on to a Kafka topic on the local system, start the Zookeepeer instance as the Kafka uses this (default port for zookeeper is 2181)

      bin/zookeeper-server-start.sh config/zookeeper.properties
* Start the kafka server from the terminal  (default port for Kafka server is 9092)

      bin/kafka-server-start.sh config/server.properties
* Create a Kafka TOPIC which can be used in the application for posting the data (KAFKA_CONSUMER_TOPIC is the name of my topic) 

      bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic KAFKA_CONSUMER_TOPIC
* Publish to Kafla Topic via Console and comsume that through the application

      bin/kafka-console-producer.sh --broker-list localhost:9092 --topic KAFKA_CONSUMER_TOPIC
