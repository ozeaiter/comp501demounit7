package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.Random;

/*
 * Program Author: Oussama Zeaiter
 * Student ID: 3622985
 * Date: April 7, 2024
 * Assignment Number: 3
 * Program Name: WeatherForecastService
 * Program Description: This service class generates a random weather report for a specified city.
 * */

/*
 * Primary Documentation
 * Program Purpose: The purpose of `WeatherForecastService` class is to generate a random weather report for a specific city. It includes city, temperature and weather description.
 * Code Behaviour: `WeatherForecastService` contains two private helper methods `getRandomTemperature` and `getWeatherDescription`, and one public method `getWeather` for generating the weather report.
 * Compilation & Execution: Compilation & execution is managed through the associated Spring Boot application. Refer to the main application class documentation for details.
 * Instance Variables: `WeatherForecastService` has one instance variable - `random` of class java.util.Random for generating random temperature.
 */

/*
 * Test Plan:
 * Test Cases, Expected Results, and Limitations:
 *
 *    Test Case 1: Calling the getWeather method with a valid string "Boston".
 *    Expected Result: The getWeather method should return a `Weather` object with "Boston" as city, some random temperature between -30.0 and 60.0 and a weather description based on the temperature.
 *    Limitations: Since the response is based on random data, repeating the test may yield different results.
 *
 *    Test Case 2: Calling the getWeather method with an empty string "".
 *    Expected Result: The getWeather method would still return a `Weather` object but the city value would be empty, and temperature and description being valid.
 *    Limitations: The method doesn't handle inappropriate inputs like empty strings.
 *
 *    Test Case 3: Calling the getWeather method multiple times with the same city name 'Detroit'.
 *    Expected Result: In each call, the `getWeather` method should return a `Weather` object with "Detroit" as city name, but the temperature and description can differ for each call due to the random nature of the output.
 *    Limitations: Repeated calls with the same city name do not yield consistent weather data due to the randomness.
 *
 * Improvements: Method could be improved by handling invalid inputs like empty strings or null. Also, the method currently provides random weather info, it could be connected to a live API to provide actual weather data.
 */

@Service
public class WeatherForecastService {
    private final Random random = new Random();

    /**
     * Generates a random temperature within the range of -30.0 to 60.0.
     *
     * @return double representing the random temperature.
     */
    private double getRandomTemperature() {
        return -30.0 + (60.0 - -30.0) * random.nextDouble();
    }

    /**
     * Determines the weather description based on the given temperature.
     *
     * @param temperature double representing the temperature.
     * @return String representing the weather description.
     */
    private String getWeatherDescription(double temperature) {
        if (temperature < 0)
            return "Freezing";
        else if (temperature < 10)
            return "Cold";
        else if (temperature < 20)
            return "Cool";
        else if (temperature < 30)
            return "Warm";
        else
            return "Hot";
    }

    /**
     * Generates a weather report for the specified city. Weather report includes city, temperature and weather description.
     *
     * @param city String representing the city for which the weather forecast will be generated.
     * @return Weather object containing information about the city, temperature, and weather description.
     */
    public Weather getWeather(String city) {
        double temperature = getRandomTemperature();
        String description = getWeatherDescription(temperature);
        return new Weather(city, temperature, description);
    }
}