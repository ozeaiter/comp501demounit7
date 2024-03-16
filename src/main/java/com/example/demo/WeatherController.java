package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Program Author: Oussama Zeaiter
 * Student ID: 3622985
 * Date: April 7, 2024
 * Assignment Number: 3
 * Program Name: WeatherController
 * Program Description: Provides an API endpoint (/api/weather) for handling weather-related requests and responses.
 * */

/*
 * Primary Documentation
 * Program Purpose: The purpose of `WeatherController` class is to handle incoming HTTP requests related to the weather data for specified cities.
 * Code Behaviour: `WeatherController` exposes a REST API endpoint and uses the `WeatherForecastService` to get weather data. It has one method `getWeather` for handling GET requests.
 * Compilation & Execution: Compilation & execution is managed through the associated Spring Boot application. Refer to the main application class documentation for details.
 * Classes Used: `WeatherController` uses `WeatherForecastService` for fetching weather data.
 * Instance Variables: `WeatherController` has one instance variable - `weatherForecastService`.
 */

/*
 * Test Plan:
 * The test plan should include the test cases for the `getWeather` endpoint of the `WeatherController`.
 *
 * Test Cases, Expected Results, and Limitations:
 *
 *    Test Case 1: Test the GET /api/weather/{city} endpoint with a valid city name "Boston".
 *    Expected Result: A HTTP response with status code 200 OK and a `Weather` object in the response body representing the weather in Boston.
 *    Limitations: The response is randomly generated, repeating the test may yield different results.
 *
 *    Test Case 2: Test the GET /api/weather/{city} endpoint with an invalid city name.
 *    Expected Result: Even with an invalid city name, it should return a HTTP response with status code 200 OK and a `Weather` object with the invalid city name and some random weather data.
 *    Limitations: As the service currently does not perform any validation on the city name, passing an invalid city name will still return a response.
 *
 *    Test Case 3: Test the GET /api/weather/{city} endpoint without passing a city name.
 *    Expected Result: A HTTP response with status code 404 Not Found.
 *    Limitations: This behavior is consistent with how restful APIs typically handle such situations.
 *
 * Improvements: For a more robust and user-friendly service, implementing city name validation can be beneficial. Also adding the option to get weather for multiple cities at once could be an interesting extension. Moreover, providing more detailed weather information or forecasts for upcoming days could also be meaningful enhancements.
 */

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    /**
     * The WeatherForecastService class is responsible for generating weather forecasts for specified cities.
     */
    private final WeatherForecastService weatherForecastService;

    /**
     * WeatherController class is responsible for handling weather-related requests and responses.
     *
     * @param weatherForecastService provides weather forecast for a specified city.
     */
    @Autowired
    public WeatherController(WeatherForecastService weatherForecastService) {
        this.weatherForecastService = weatherForecastService;
    }

    /**
     * Generates a weather report for the specified city.
     * The weather report includes the city, temperature, and weather description.
     *
     * @param city String representing the city for which the weather forecast will be generated.
     * @return Weather object containing information about the city, temperature, and weather description.
     */
    @GetMapping("/{city}")
    public Weather getWeather(@PathVariable String city) {
        return weatherForecastService.getWeather(city);
    }
}
