-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: knowledge_management_db
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `designation`
--

DROP TABLE IF EXISTS `designation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `designation` (
  `designation_id` int NOT NULL AUTO_INCREMENT,
  `designation` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`designation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `designation`
--

LOCK TABLES `designation` WRITE;
/*!40000 ALTER TABLE `designation` DISABLE KEYS */;
INSERT INTO `designation` VALUES (1,'Architect'),(2,'Developer'),(3,'Designer'),(4,'Tester'),(5,'Project Manager'),(6,'Team Lead'),(7,'Manager');
/*!40000 ALTER TABLE `designation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document`
--

DROP TABLE IF EXISTS `document`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `document` (
  `document_id` int NOT NULL,
  `project_id` int DEFAULT NULL,
  `document_name` varchar(50) DEFAULT NULL,
  `document_type_id` int DEFAULT NULL,
  `upload_date` date DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`document_id`),
  KEY `project_id` (`project_id`),
  KEY `document_type_id` (`document_type_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `document_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `project` (`project_id`),
  CONSTRAINT `document_ibfk_2` FOREIGN KEY (`document_type_id`) REFERENCES `documenttype` (`document_type_id`),
  CONSTRAINT `document_ibfk_3` FOREIGN KEY (`created_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `document_ibfk_4` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document`
--

LOCK TABLES `document` WRITE;
/*!40000 ALTER TABLE `document` DISABLE KEYS */;
INSERT INTO `document` VALUES (1,15,'Requirements_Doc_1',5,'2023-01-15',1,1,'2023-01-15','2023-01-20'),(2,15,'Design_Doc_1',4,'2023-02-20',2,2,'2023-02-20','2023-02-25'),(3,15,'Test_Doc_1',7,'2023-03-25',3,3,'2023-03-25','2023-03-30'),(4,15,'Financial_Doc_1',2,'2023-04-30',4,4,'2023-04-30','2023-05-05'),(5,15,'Legal_Doc_1',3,'2023-05-15',5,5,'2023-05-15','2023-05-20'),(6,16,'Requirements_Doc_2',5,'2023-06-01',1,1,'2023-06-01','2023-06-05'),(7,16,'Design_Doc_2',4,'2023-07-05',2,2,'2023-07-05','2023-07-10'),(8,16,'Test_Doc_2',7,'2023-08-10',3,3,'2023-08-10','2023-08-15'),(9,16,'Financial_Doc_2',2,'2023-09-15',4,4,'2023-09-15','2023-09-20'),(10,16,'Legal_Doc_2',3,'2023-10-20',5,5,'2023-10-20','2023-10-25'),(11,17,'Requirements_Doc_3',5,'2023-11-01',1,1,'2023-11-01','2023-11-05'),(12,17,'Design_Doc_3',4,'2023-12-05',2,2,'2023-12-05','2023-12-10'),(13,17,'Test_Doc_3',7,'2024-01-10',3,3,'2024-01-10','2024-01-15'),(14,17,'Financial_Doc_3',2,'2024-02-15',4,4,'2024-02-15','2024-02-20'),(15,17,'Legal_Doc_3',3,'2024-03-20',5,5,'2024-03-20','2024-03-25'),(16,18,'Requirements_Doc_4',5,'2024-04-01',1,1,'2024-04-01','2024-04-05'),(17,18,'Design_Doc_4',4,'2024-05-05',2,2,'2024-05-05','2024-05-10'),(18,18,'Test_Doc_4',7,'2024-06-10',3,3,'2024-06-10','2024-06-15'),(19,18,'Financial_Doc_4',2,'2024-07-15',4,4,'2024-07-15','2024-07-20'),(20,18,'Legal_Doc_4',3,'2024-08-20',5,5,'2024-08-20','2024-08-25'),(21,19,'Requirements_Doc_5',5,'2024-09-01',1,1,'2024-09-01','2024-09-05'),(22,19,'Design_Doc_5',4,'2024-10-05',2,2,'2024-10-05','2024-10-10'),(23,19,'Test_Doc_5',7,'2024-11-10',3,3,'2024-11-10','2024-11-15'),(24,19,'Financial_Doc_5',2,'2024-12-15',4,4,'2024-12-15','2024-12-20'),(25,19,'Legal_Doc_5',3,'2025-01-20',5,5,'2025-01-20','2025-01-25'),(26,20,'Requirements_Doc_6',5,'2025-02-01',1,1,'2025-02-01','2025-02-05'),(27,20,'Design_Doc_6',4,'2025-03-05',2,2,'2025-03-05','2025-03-10'),(28,20,'Test_Doc_6',7,'2025-04-10',3,3,'2025-04-10','2025-04-15'),(29,20,'Financial_Doc_6',2,'2025-05-15',4,4,'2025-05-15','2025-05-20'),(30,20,'Legal_Doc_6',3,'2025-06-20',5,5,'2025-06-20','2025-06-25'),(31,21,'Requirements_Doc_7',5,'2025-07-01',1,1,'2025-07-01','2025-07-05'),(32,21,'Design_Doc_7',4,'2025-08-05',2,2,'2025-08-05','2025-08-10'),(33,21,'Test_Doc_7',7,'2025-09-10',3,3,'2025-09-10','2025-09-15'),(34,21,'Financial_Doc_7',2,'2025-10-15',4,4,'2025-10-15','2025-10-20'),(35,21,'Legal_Doc_7',3,'2025-11-20',5,5,'2025-11-20','2025-11-25');
/*!40000 ALTER TABLE `document` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documenttype`
--

DROP TABLE IF EXISTS `documenttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `documenttype` (
  `document_type_id` int NOT NULL,
  `document_type` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`document_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documenttype`
--

LOCK TABLES `documenttype` WRITE;
/*!40000 ALTER TABLE `documenttype` DISABLE KEYS */;
INSERT INTO `documenttype` VALUES (1,'Project Plan'),(2,'Requirement Specification'),(3,'Test Plan'),(4,'Technical Design Document'),(5,'User Manual'),(6,'Progress Report'),(7,'Meeting Minutes');
/*!40000 ALTER TABLE `documenttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employee_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  `designation_id` int DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  KEY `designation_id` (`designation_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`created_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `employee_ibfk_3` FOREIGN KEY (`designation_id`) REFERENCES `designation` (`designation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Emna','emna@gmail.com',1,1,'2023-01-15','2023-01-30',1),(2,'Emma','emma@gmail.com',1,1,'2023-02-20','2023-02-25',2),(3,'Emmanu','emmanu@gmail.com',2,2,'2023-03-25','2023-03-30',3),(4,'Rini','rini@gmail.com',2,2,'2023-04-30','2023-04-30',1),(5,'Sona','sona@gmail.com',3,3,'2023-05-15','2023-05-20',2),(6,'Emil','emil@gmail.com',3,3,'2023-06-20','2023-06-25',3),(7,'Noel','noel@gmail.com',1,1,'2023-07-25','2023-07-30',1),(8,'Dency','dency@gmail.com',4,5,'2001-08-11','2024-05-02',7);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `knowledge_article`
--

DROP TABLE IF EXISTS `knowledge_article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `knowledge_article` (
  `article_id` int NOT NULL,
  `project_id` int DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`article_id`),
  KEY `project_id` (`project_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `knowledge_article_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `project` (`project_id`),
  CONSTRAINT `knowledge_article_ibfk_2` FOREIGN KEY (`created_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `knowledge_article_ibfk_3` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `knowledge_article`
--

LOCK TABLES `knowledge_article` WRITE;
/*!40000 ALTER TABLE `knowledge_article` DISABLE KEYS */;
INSERT INTO `knowledge_article` VALUES (1,15,'Introduction to Project Management','This article provides an overview of project management principles and practices.',1,1,'2023-01-15','2023-01-20'),(2,16,'Data Encryption Techniques','Explore various encryption methods and their applications in data security.',2,2,'2023-02-20','2023-02-25'),(3,17,'Advanced Database Optimization','Learn advanced techniques for optimizing database performance and scalability.',3,3,'2023-03-25','2023-03-30'),(4,18,'Introduction to Machine Learning','Discover the basics of machine learning algorithms and their real-world applications.',4,4,'2023-04-30','2023-05-05'),(5,19,'Effective Communication Strategies','Explore strategies for improving communication skills in professional settings.',5,5,'2023-05-15','2023-05-20'),(6,20,'Cybersecurity Best Practices','Learn about essential cybersecurity measures to protect against online threats.',1,1,'2023-06-01','2023-06-05'),(7,21,'Introduction to Agile Methodology','Understand the principles and benefits of Agile software development methodology.',2,2,'2023-07-05','2023-07-10'),(8,15,'Cloud Computing Essentials','Explore the fundamental concepts and advantages of cloud computing technology.',3,3,'2023-08-10','2023-08-15'),(9,16,'Blockchain Technology Explained','Learn how blockchain works and its potential applications across industries.',4,4,'2023-09-15','2023-09-20'),(10,17,'Data Science Fundamentals','Discover the core concepts and tools used in data science for actionable insights.',5,5,'2023-10-20','2023-10-25'),(11,18,'Artificial Intelligence Overview','An overview of artificial intelligence, its subfields, and current trends.',1,1,'2023-11-01','2023-11-05'),(12,19,'Mobile App Development Basics','Get started with mobile app development and key considerations for success.',2,2,'2023-12-05','2023-12-10'),(13,20,'Network Security Fundamentals','Understand the basics of network security and common threats to network infrastructure.',3,3,'2024-01-10','2024-01-15'),(14,21,'Introduction to DevOps','An overview of DevOps principles and practices for efficient software development and deployment.',4,4,'2024-02-15','2024-02-20'),(15,15,'Web Development Technologies','Explore modern web development technologies and frameworks for building dynamic websites.',5,5,'2024-03-20','2024-03-25'),(16,16,'Data Visualization Techniques','Learn methods for visually representing data to gain insights and communicate findings effectively.',1,1,'2024-04-01','2024-04-05'),(17,17,'Software Testing Strategies','Discover various software testing methodologies and best practices for ensuring product quality.',2,2,'2024-05-05','2024-05-10'),(18,18,'User Experience Design Basics','An introduction to UX design principles and techniques for creating user-friendly interfaces.',3,3,'2024-06-10','2024-06-15'),(19,19,'Big Data Analytics Overview','Explore the challenges and opportunities of big data analytics in todays data-driven world.',4,4,'2024-07-15','2024-07-20'),(20,20,'Project Risk Management Strategies','Learn effective strategies for identifying, assessing, and mitigating project risks.',5,5,'2024-08-20','2024-08-25'),(21,21,'Introduction to Python Programming','An introduction to the Python programming language and its applications in various domains.',1,1,'2024-09-01','2024-09-05'),(22,15,'Artificial Neural Networks','Understand the architecture of artificial neural networks for machine learning tasks.',2,2,'2024-10-05','2024-10-10'),(23,16,'Cloud Security Best Practices','Learn about security measures and best practices for protecting data and applications in the cloud.',3,3,'2024-11-10','2024-11-15'),(24,17,'Agile Project Management Techniques','Explore advanced Agile project management techniques for enhanced team collaboration and delivery.',4,4,'2024-12-15','2024-12-20'),(25,18,'Introduction to Data Warehousing','An overview of data warehousing concepts and architecture for business intelligence and analytics.',5,5,'2025-01-20','2025-01-25'),(26,19,'UI Design Principles','Learn about  principles of UI design and how to create visually appealing user-friendly interfaces.',1,1,'2025-02-01','2025-02-05'),(27,20,'Introduction to Data Mining','Discover the basics of data mining and its applications in extracting valuable insights from large datasets.',2,2,'2025-03-05','2025-03-10'),(28,21,'Software Development Life Cycle (SDLC)','An overview of the different stages of the software development life cycle and their importance in project management.',3,3,'2025-04-10','2025-04-15'),(29,15,'Responsive Web Design Techniques','Explore techniques for creating responsive web designs that adapt to various screen sizes and devices.',4,4,'2025-05-15','2025-05-20'),(30,16,'Natural Language Processing Fundamentals','An introduction to natural language processing (NLP) techniques and their applications in text analysis and understanding.',5,5,'2025-06-20','2025-06-25'),(31,17,'Continuous Integration and Continuous Deployment','Learn about CI/CD pipelines and how they streamline the process of deploying software.',1,1,'2025-07-01','2025-07-05'),(32,18,'Scrum Framework Overview','An overview of the Scrum framework, its roles, events, and artifacts, for Agile project management.',2,2,'2025-08-05','2025-08-10'),(33,19,'Data Governance Best Practices','Explore best practices for establishing data governance frameworks to ensure data quality, security, and compliance.',3,3,'2025-09-10','2025-09-15'),(34,20,'Introduction to Microservices Architecture','An introduction to microservices architecture and its advantages for building scalable and resilient applications.',4,4,'2025-10-15','2025-10-20'),(35,21,'Ethical Hacking Fundamentals','Learn about ethical hacking techniques and methodologies to identify and mitigate security vulnerabilities.',5,5,'2025-11-20','2025-11-25');
/*!40000 ALTER TABLE `knowledge_article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `priority`
--

DROP TABLE IF EXISTS `priority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `priority` (
  `priority_id` int NOT NULL AUTO_INCREMENT,
  `priority` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`priority_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `priority`
--

LOCK TABLES `priority` WRITE;
/*!40000 ALTER TABLE `priority` DISABLE KEYS */;
INSERT INTO `priority` VALUES (1,'High'),(2,'Medium'),(3,'Low'),(4,'Critical'),(5,'Normal'),(6,'Urgent'),(7,'Minor');
/*!40000 ALTER TABLE `priority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `project_id` int NOT NULL AUTO_INCREMENT,
  `project_name` varchar(55) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `priority_id` int DEFAULT NULL,
  PRIMARY KEY (`project_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  KEY `priority_id` (`priority_id`),
  CONSTRAINT `project_ibfk_1` FOREIGN KEY (`created_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `project_ibfk_2` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `project_ibfk_3` FOREIGN KEY (`priority_id`) REFERENCES `priority` (`priority_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (15,'Website Redesign','2023-01-15','2023-01-15','2023-01-15','2023-07-31',1,1,1),(16,'Mobile App Development','2023-02-20','2023-02-20','2023-02-20','2023-12-31',2,2,2),(17,'Database Migration','2023-03-25','2023-03-25','2023-03-25','2023-09-30',3,3,3),(18,'Cloud Integration','2023-04-30','2023-04-30','2023-04-30','2024-03-31',4,4,4),(19,'AI Chatbot Implementation','2023-05-15','2023-05-15','2023-05-15','2024-06-30',5,5,5),(20,'E-commerce Platform Upgrade','2023-06-20','2023-06-20','2023-06-20','2024-09-30',6,6,6),(21,'Cybersecurity Enhancement','2023-07-25','2023-07-25','2023-07-25','2025-12-31',7,7,7);
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_priority`
--

DROP TABLE IF EXISTS `project_priority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project_priority` (
  `project_priority_id` int NOT NULL,
  `priority_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`project_priority_id`),
  KEY `priority_id` (`priority_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `project_priority_ibfk_1` FOREIGN KEY (`priority_id`) REFERENCES `priority` (`priority_id`),
  CONSTRAINT `project_priority_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_priority`
--

LOCK TABLES `project_priority` WRITE;
/*!40000 ALTER TABLE `project_priority` DISABLE KEYS */;
INSERT INTO `project_priority` VALUES (1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,6),(7,7,7);
/*!40000 ALTER TABLE `project_priority` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 15:10:39
