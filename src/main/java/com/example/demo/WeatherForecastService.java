package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.Random;

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