/* Create a `Temperature` class with a private constructor and static factory methods:

* `fromCelsius(double c)`
* `fromFahrenheit(double f)`
* `fromKelvin(double k)`

All should convert to an internal Celsius representation. */
package com.example.item_one;

class Temperature {

    private final double temperature;

    private Temperature(double celsius) {
        this.temperature = celsius;
    }

    public static Temperature fromCelsius(double c) {
        return new Temperature(c);
    }

    public static Temperature fromFahrenheit(double f) {
        double celsius = ((f - 32) * 5) / 9;
        return new Temperature(celsius);
    }

    public static Temperature fromKelvin(double k) {
        if (k < 0) {
            throw new IllegalArgumentException("Kelvin cannot be negative");
        }
        return new Temperature(k - 273.15);
    }

    public double getTemperature() {
        return temperature;
    }

}

public class ProblemOne {

    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelsius(15);
        Temperature t2 = Temperature.fromFahrenheit(212);
        Temperature t3 = Temperature.fromKelvin(371);
        System.out.println(t1.getTemperature());
        System.out.println(t2.getTemperature());
        System.out.println(t3.getTemperature());
    }
}
