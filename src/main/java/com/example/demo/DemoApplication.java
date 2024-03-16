package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* Program Author: Oussama Zeaiter
* Student ID: 3622985
* Date: April 7, 2024
* Assignment Number: 3
* Program Name: DemoApplication
* Program Description: This program demonstrates the use of the Spring Boot for building a standalone, production-grade,
* auto-configured Spring Application. The `main()` method in the `DemoApplication` class invokes Spring Boot's
* `SpringApplication` via `run()`, to bootstrap the application.
* */

/*
 * Primary Documentation
 * Program Purpose: The purpose of the `DemoApplication` program is to bootstrap the Spring Boot application. This serves as the entry point for launching the Spring Boot application.
 * Code Behaviour: The `DemoApplication` class contains a main method - the `main()` method triggers the startup of the Spring Boot application by calling the `SpringApplication`'s `run()` method.
 * Compiling: Compilation is typically managed by the IDE or by Gradle build tool. Before you can build your application, ensure you have Gradle installed. You need to have Java 8+.
 * If not, follow these steps:
 * Download the latest Gradle distribution from the official Gradle website. https://gradle.org/releases/. Download the `binary-only` v8.6.
 * Unzip the distribution zip file in the directory you wish to install Gradle, and copy the path to the `bin` directory.
 * Configure your system environment:
 * In File Explorer right-click on the Computer icon, choose `Properties`, then click `Advanced system settings`.
 * On the `Advanced` tab, click `Environment Variables`.
 * Under `User variables`, click `Path/Edit/New`.
 * Paste the copied path to the Gradle bin directory.
 * Click `OK` to save.
 * Open a new Command Prompt and run `gradle -v` to check if Gradle is properly installed.
 * After installing Gradle, run the following commands in order in the project directory:
 * 1. gradle build
 * 2. gradle bootJar
 * You should see two .jar files: demo-0.0.1-SNAPSHOT-plain.jar, demo-0.0.1-SNAPSHOT.jar
 * Execution: Execute the application by running the following command `java -jar build/libs/demo-0.0.1-SNAPSHOT.jar`. The application will start and listen on the following endpoint: http://localhost:8080. You can make a test call: http://localhost:8080/api/weather/calgary, and should receive a JSON response object.
 * Classes Used: `DemoApplication` and any additional classes used in the application described in the Spring Configuration file (if any).
 * Instance Variables: `DemoApplication` does not have any instance variables. Relevant instance variables depend on the details of the specific application.
 */

/*
 * Test Plan:
 * The test plan includes the test cases for the main method of the DemoApplication class. As the program doesn't have any other methods, there would not be more tests required.

 * Test Cases, Expected Results, and Limitations:

 *    Test Case 1: Starting up the application by running the main method.
 *    Expected Result: The program should start without any errors and the Spring Boot application should run successfully.
 *    Limitations: This application might not run properly if the necessary Spring Boot dependencies are not provided or loaded correctly.

 *    Test Case 2: Running the main method while providing command line argument values.
 *    Expected Result: If the application uses command line arguments, they should be loaded correctly and should affect the program as expected. The exact behaviour is specific to the application design.
 *    Limitations: If a particular piece of code is supposed to read the command line arguments in a specific order and there is a change in this order, then there might be unexpected behaviour in the application.

 * Improvements: As this is the bootstrapping section of the code, there is not much to improve or add. You could add more logging features to record the starting and shutting down phases of the application, or implement a more complex parameter loading and parsing system for command line arguments.
 */

/**
 * The DemoApplication class represents a Spring Boot application.
 * This is the main entry point to the application, and it handles bootstrapping the application.
 */
@SpringBootApplication
public class DemoApplication {

    /**
     * The main method of the DemoApplication class.
     * It triggers the application startup by calling the SpringApplication class's run() method.
     * @param args These are the command line arguments that the program accepts.
     * Currently, these arguments do not affect the program's execution as they are not used in the code.
     */
    public static void main(String[] args) {
        // Begins the execution of the Spring Boot application
        SpringApplication.run(DemoApplication.class, args);
    }
}