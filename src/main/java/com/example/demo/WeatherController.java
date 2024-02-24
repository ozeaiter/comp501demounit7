package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
