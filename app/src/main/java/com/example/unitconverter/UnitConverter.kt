package com.example.unitconverter

object UnitConverter {

    // Temperature conversion
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9 / 5 + 32
    }

    fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5 / 9
    }

    // Length conversion
    fun metersToKilometers(meters: Double): Double {
        return meters / 1000
    }

    fun kilometersToMeters(kilometers: Double): Double {
        return kilometers * 1000
    }

    // Weight conversion
    fun gramsToKilograms(grams: Double): Double {
        return grams / 1000
    }

    fun kilogramsToGrams(kilograms: Double): Double {
        return kilograms * 1000
    }
}
