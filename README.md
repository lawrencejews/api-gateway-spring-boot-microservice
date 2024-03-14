#### Spring Boot Microservices - Gamification
This is spring boot monorepo which contains a Config-server, Discovery, API Gateway, Quest-Service, Rewards-Service,
User-Reward-Service and Users-Service.
###### Project Set-Up
- `RUN IN ORDER:` The Config-server, Discovery, API Gateway then start the other business logic microservice.
- Eureka Server run on Port `localhost:8761 `but run the config-server first then run other services.
- API testing done locally with postman for the endpoints and postgres database.
- Gateway: Provides a simple, yet effective way to route to APIs in Servlet-based applications.
- Provides cross-cutting concerns to those APIs such as security, monitoring/metrics, and resiliency. 
- Eureka Discovery Client: A REST based service for locating services for the purpose of load balancing and failover of middle-tier servers. 
- Config Client: Client that connects to a Spring Cloud Config Server to fetch the application's configuration. 
- Spring Boot Actuator: Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions. 
- NOTE: To activate the mono-repo -> `go to file` then select` modules from existing sources` -> select `project pom.xml` .

###### Docker Images using Docker Desktop
  - Create the `.jar` build in the target folder `mvn clean install .`
  - Build on the local environment `docker build -t lawrencejews/config-server:latest .`
  - Push docker container to docker hub `docker push lawrencejews/config-server:latest`. 
  - Each service has a dockerfile
  - NOTE: To build a docker container,change java version from `17` to `21` to accommodate `lombok-compiler`.
###### Docker Images with Jib
- Jib can be used to create docker containers for spring projects then push them to the docker registry.
- Docker hub jib push: `mvn clean compile jib:build `.
- Docker run locally: `mvn clean compile jib:dockerBuild `.
##### Kubernetes
- Pull the images created and create a deployment + service.