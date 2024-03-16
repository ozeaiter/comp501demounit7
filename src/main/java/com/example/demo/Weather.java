package com.example.demo;

/*
 * Program Author: Oussama Zeaiter
 * Student ID: 3622985
 * Date: April 7, 2024
 * Assignment Number: 3
 * Program Name: Weather
 * Program Description: This program is a simple POJO (Plain Old Java Object) representing weather conditions in a specific city.
 * */

/*
 * Primary Documentation
 * Program Purpose: The purpose of the `Weather` class is to represent the weather data object model in the application with attributes like city, temperature, and description. It is a simple POJO that serves as a data structure.
 * Code Behaviour: The `Weather` class includes a constructor and getter and setter methods for all attributes.
 * Compilation & Execution: Compilation and execution is managed through the associated Spring Boot application. Refer to the main application class documentation for details.
 * Classes Used: The `Weather` class is typically used with other components in the application, like Controllers, Services, or Repositories, depending on the application design.
 * Instance Variables: The `Weather` class has three instance variables - `city`, `temperature` and `description`.
 */

/*
 * Test Plan:
 * The test plan should include the test cases for the constructor, getter and setter methods of the Weather class.
 * Test Cases, Expected Results, and Limitations:
 *
 *    Test Case 1: Creating an instance of the Weather class using the constructor, passing appropriate values.
 *    Expected Result: A new instance of the Weather class would be created with the attributes set as per the values passed to the constructor.
 *    Limitations: No validation is done in the constructor. If invalid data (like null or inappropriate data types) is passed, it may lead to issues later on when the getters are accessed.
 *
 *    Test Case 2: Calling the getter methods after the object is created.
 *    Expected Result: The values set during the object creation should be returned.
 *    Limitations: Getters work based on the values set during object creation or through setters. If no value was set, it will return null (for String) or default values (for primitive types).
 *
 *    Test Case 3: Using the setter methods to change some values of the object, and then retrieving the values using the getter methods.
 *    Expected Result: The new values set by the setter methods should be returned.
 *    Limitations: Again, there are no validations in setters.
 *
 * Improvements: Validations could be added for the temperature (like checking for plausible temperature values) or city (like checking for non-null or non-empty). Also, additional fields related to weather information (like humidity, wind speed, etc.) could be added.
 */

/**
 * The Weather class represents a basic model of weather information.
 * It includes city, temperature and description attributes and respective getter and setter methods.
 */
public class Weather {

    private String city;
    private double temperature;
    private String description;

    /**
     * Constructor initializing Weather object with city, temperature and description.
     * @param city city for which weather details are given.
     * @param temperature temperature in the city.
     * @param description brief description of the weather.
     */
    public Weather(String city, double temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }

    /**
     * Getter for city attribute.
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Getter for temperature attribute.
     * @return temperature
     */
    public double getTemperature() {
        return this.temperature;
    }

    /**
     * Getter for description attribute.
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for city attribute.
     * @param city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Setter for temperature attribute.
     * @param temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Setter for description attribute.
     * @param description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}