package com.example.demo;

public class Weather {
    private String city;
    private double temperature;
    private String description;

    public Weather(String city, double temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }

    public String getCity() {
        return this.city;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
