# Springboot_Microservices
Micro services using spring boot cloud, eureka server, feign client, circuit breaker, gateway
This repository contains the demo of micro services using spring cloud. 

Discovery service- Registry for service discovery
Producer service- Produces the REST endpoints, This will be registered as a client in the Eureka server.
Consumer service - This is also registered as a Eureka client, it invokes the producer endpoint using Feign client. It contains a fallback (circuit breaker) mechanism as well.
Gateway service - This is used for routing the incoming requests to the service

This is a gradle project. to run this usinf 'bootrun' command in gradle
