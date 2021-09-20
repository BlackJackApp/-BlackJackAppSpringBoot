# BlackJackAppSpringBoot

Authors: Arkaan Quanunga, Sam King

## Summary

This project focuses on creating a web application of Black Jack using Spring boot. React is used for the presentation layer of this project.The project uses 8 decks and shuffles them at the start of the game. Player wins the game by having more points than Dealer. 

See [Rules](#Rules) for additional information.

Refer to [Software Requirement Specification](#Software_Requirement_Specification.docx) for detailed description of project.

## Content
* [Introduction](#BlackJackAppSpringBoot)
* [Architecture](#Architecture)
    * [Micro Service Architecture](#Micro-Service-Architecture)
    * [React Service](#React-Service-Setup)
    * [Spring Boot Service](#Spring-Boot-Service-Setup)
* [Development Environment](#Development-Environment)
    * [Architecture](#Development-Architecture)
    * [Kanban Board](#Kanban-Board)
    * [React Server Setup](#React-Server-Setup)
    * [Spring Boot Server Setup](#Spring-Boot-Server-Setup)
* [Tools](#Tools)
* [Continuous Integration](#Continuous-Integration)
* [Testing](#Testing)
* [Future Improvements](#Future-Improvements)
* [References](#References)

    

## Architecture

### Micro Service Architecture

![Architecture](./READMEAssets/Architecture.jpg)

### React Service Setup

1. Go to command line of Windows
2. Type the following command:

`   npm create-react-app BlackjackAppReact
`

This creates the standard React Service named BlackjackAppReact

3. Change directory to BlackjackAppReact in command line
4. Type the following command:

   `   npm install
   `

  This will install all the required dependencies for the project.

### Spring Boot Service Setup

1. Go to https://start.spring.io/
2. Name the Artifact and give it a suitable name
3. Generate the Folder
4. Open the folder in IntelliJ and add the dependencies from maven repository stated in [Tools](#Tools)
5. Build the Project and start working on the classes for BlackJack
## Development Environment

### Development Architecture

### Kanban Board

Jira is being used for Kanban Board to visualise the work to be done: 

![Kanban board](./READMEAssets/Kanbanboard.JPG)


### React Server Setup

   1. Open command prompt 
   2. Navigate to the project folder
   3. Run the following code:
  
     npm start
     
This should run the server for React App getting accessed by localhost:3000     
### Spring Boot Server Setup

   1. Open command prompt 
   2. Navigate to the project folder 
   3. Run the following code:
    
     mvn spring-boot: run 

This should run the server for Spring Boot getting accessed by localhost:8080 

     
## Tools
* Windows 10 as operating System 
* Microsoft Office Suite for Documentation
* Java 16 for programming the back-end application. 
* Jira – Kanban Board of choice 
* IntelliJ IDEA 2021.1 Community Edition by JetBrains for IDE 
* Sonar Cloud for checking code smells, security vulnerabilities, and bugs. 
* SpringBoot for back-end development 
* React for front-end development 
* Git 2.33 by Linus Torvalds for version control 
* Git Hub for cloud-based hosting service, managing Git Repositories 
* Apache Maven 3.8.1 based on a project object model (POM) 
* Junit 5.8 testing framework for writing unit tests – Dependency 
* Jacoco 0.8.7 for measuring code coverage in a codebase through visual reports 
* IO. Cucumber JUnit 6.11.0 for Feature Testing and Use Case Testing - Dependency 
* Cucumber for Java 212.4746.52 - Plug-In. IntelliJ. 
* Selenium 3.141.59 for testing web application- Integration Testing for both Microservices. 
* Jenkins - Open-source CI/CD pipeline builder. Very flexible in its implementation. 

## Continuous Integration
Jenkins is being used for Continuous Integration Process with Sonar Cloud

### Jenkins Setup
1. Open Amazon Web Services Account
2. Set up security on Amazon Account by Multi-Factor Authentication(MFA)
3. Go to EC2 Service on Amazon Web Service
4. Set up a new EC2 instance for Linux Ubuntu 20.13 Server with x84 architecture
5. The EC2 instance must have a security group with 8080 and 3000 TCP protocol open.
6. Launch the instance and wait for 3-5 minutes
7. Connect to the instance
8. You will need to update the Linux System Server and Install Java
9. Type the following commands:

`   sudo apt-get update`

`   sudo apt install default-jre`

`   java -version `

`sudo apt install default-jdk`

`javac -version`

10. To install jenkins follow the commands:


`wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb https://pkg.jenkins.io/debian-stable binary/ > \
/etc/apt/sources.list.d/jenkins.list'`

`sudo apt-get update`

`sudo apt-get install jenkins
`
11. To run the Jenkins server, follow the commands:

`sudo systemctl start jenkins`

12. Open up a new tab and copy the IP public address from your instance to the address bar.

    It should look like this: 37.167.37.154

13. Add :8080 at the end.

    The address bar should look like this: 37.167.37.154:8080

14. Copy the path obtained from jenkins page
15. Go back to the EC2 instance and type the following command:

`    sudo cat /home/jenkins /var/lib/jenkins
`

16. Now copy and paste the key obtained from the code into the jenkins tab.
17. Install the necessary updates and create your user.
18. Jenkins is ready for use.


** Disclaimer!!**

** YOU WILL GET CHARGED FOR THIS INSTANCE**

** DO AT YOUR OWN RISK**
## Risk Assessment
SWOT Analysis:

Risk assessment:
1) Eye strain
2) Posture issues/ Back strain
3) Too focussed on development rather than testing
4) Poor time management
5) Plugin issues
6) Missing deadlines
7) Scope Creep
8) Unclear Requirements
9) Poor communication
10) Working from home distraction
11) Lack of training with given software
12) Hardware breaking down 

![img_1.png](./READMEAssets/img_1.png)

## Testing

Refer to [Test Plan](Test_Plan.docx) for detailed view.

## Future Improvements

This is the best app there is for blackjack you can't improve it.

## References

https://github.com/arkaan27/BlackJack4.0

https://github.com/GarethDavisDWG/Blackjack

