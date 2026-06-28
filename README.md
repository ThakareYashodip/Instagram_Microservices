INSTAGRAM LITE – MICROSERVICES BASED SOCIAL
MEDIA PLATFORM
1. Project Title
Instagram Lite – A Microservices-Based Social Media Application using Spring Boot and Spring Cloud
2. Introduction
Social media applications have become an essential part of modern communication, allowing users to share
content, interact with others, and build online communities. Traditional monolithic architectures often face
challenges in scalability, maintainability, and independent deployment as applications grow.
The proposed project, Instagram Lite, is a lightweight social media platform inspired by Instagram and
designed using a Microservices Architecture. The system enables users to create profiles, upload posts,
like and comment on posts, and follow other users. Each major business capability is implemented as an
independent microservice, providing better scalability, fault isolation, and ease of maintenance.
The project leverages Spring Boot, Spring Cloud, Eureka Service Discovery, API Gateway, OpenFeign, and
Docker to simulate a real-world enterprise-grade backend system.
3. Problem Statement
Most beginner social media projects are built as monolithic applications where all functionalities reside
within a single codebase and database. Such systems become difficult to maintain, deploy, and scale
independently.
The challenge is to design a social media application that:
• 
• 
• 
• 
Supports independent deployment of different modules.
Enables better scalability and maintainability.
Demonstrates real-world distributed system concepts.
Uses modern cloud-native development practices.
4. Objective
The primary objectives of this project are:
• 
To develop a lightweight Instagram-inspired platform.
1
• 
• 
• 
• 
• 
• 
• 
To implement Microservices Architecture using Spring Boot.
To enable users to create profiles, posts, comments, likes, and follow relationships.
To establish communication between services using OpenFeign.
To implement service discovery through Eureka Server.
To manage routing using Spring Cloud Gateway.
To containerize services using Docker and Docker Compose.
To demonstrate scalable and maintainable backend design principles.
5. Proposed System
The proposed system consists of multiple independent services:
User Service
Responsible for:
• 
• 
• 
• 
User registration
Profile management
User search
Updating profile information
Post Service
Responsible for:
• 
• 
• 
• 
Creating posts
Retrieving user posts
Generating user feeds
Deleting posts
Comment Service
Responsible for:
• 
• 
• 
Adding comments
Viewing comments
Removing comments
Like Service
Responsible for:
• 
• 
• 
Liking posts
Unliking posts
Counting total likes
2
Follow Service
Responsible for:
• 
• 
• 
Following users
Unfollowing users
Managing followers and following lists
API Gateway
Acts as the single entry point for all client requests and routes them to appropriate services.
Eureka Server
Provides service registration and discovery among all microservices.
6. System Architecture
The application follows a distributed microservices architecture:
Client
|
API Gateway
|---------------------------------------------------
|       
|        
|         
|         
User   Post   Comment    Like     
|
Follow
Service Service Service  Service  Service
|
Independent Databases
Each service owns its own database and communicates with other services through REST APIs and
OpenFeign clients.
7. Technologies Used
Category
Backend Framework
Microservices
Service Discovery
Technology
Spring Boot
Spring Cloud
Eureka Server
3
Category
Technology
API Gateway
Spring Cloud Gateway
Inter-Service Communication
OpenFeign
Database
MySQL
ORM
Spring Data JPA & Hibernate
Build Tool
Maven
Containerization
Docker
Version Control
Git & GitHub
Testing
Postman
8. Functional Requirements
The system shall provide the following functionalities:
User Management
• 
• 
• 
• 
Register new users.
Update user profiles.
Search users by username.
View user information.
Post Management
• 
• 
• 
• 
• 
Upload image posts.
Add captions.
View personal posts.
Generate personalized feeds.
Delete posts.
Comment Management
• 
• 
• 
Add comments to posts.
View comments.
Delete comments.
Like Management
• 
• 
• 
Like posts.
Unlike posts.
Count total likes.
4
Follow Management
• 
• 
• 
• 
Follow other users.
Unfollow users.
View followers.
View following lists.
9. Non-Functional Requirements
• 
• 
• 
• 
• 
• 
Scalability through independent service deployment.
High maintainability through separation of concerns.
Better fault isolation between modules.
Reusability of business services.
Easy containerized deployment using Docker.
Support for future cloud deployment and orchestration.
10. Advantages of the Proposed System
• 
• 
• 
• 
• 
• 
Independent deployment of services.
Better scalability and flexibility.
Easier maintenance and debugging.
Technology independence for future extensions.
Real-world enterprise architecture experience.
Improved fault tolerance compared to monolithic systems.
11. Future Scope
The project can be extended with additional functionalities such as:
• 
• 
• 
• 
• 
• 
• 
• 
JWT Authentication and Authorization.
Media Service with Cloudinary or AWS S3 integration.
Notification Service using Kafka.
Direct Messaging System.
Story and Reel functionalities.
Search Service with Elasticsearch.
Recommendation Engine.
Kubernetes deployment on cloud platforms.
5
12. Conclusion
Instagram Lite demonstrates the practical implementation of Microservices Architecture using Spring Boot
and Spring Cloud technologies. The system successfully separates core business functionalities into
independent services, resulting in improved scalability, maintainability, and flexibility.
The project provides hands-on experience with modern backend development practices, distributed
systems, API communication, service discovery, and cloud-native application design, making it an excellent
learning and portfolio project for enterprise software development.
6
