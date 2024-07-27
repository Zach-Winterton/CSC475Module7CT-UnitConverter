package com.example.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class UnitConverterTest {

    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, UnitConverter.celsiusToFahrenheit(0.0), 0.001)
        assertEquals(212.0, UnitConverter.celsiusToFahrenheit(100.0), 0.001)
    }

    @Test
    fun testFahrenheitToCelsius() {
        assertEquals(0.0, UnitConverter.fahrenheitToCelsius(32.0), 0.001)
        assertEquals(100.0, UnitConverter.fahrenheitToCelsius(212.0), 0.001)
    }

    @Test
    fun testMetersToKilometers() {
        assertEquals(1.0, UnitConverter.metersToKilometers(1000.0), 0.001)
        assertEquals(0.5, UnitConverter.metersToKilometers(500.0), 0.001)
    }

    @Test
    fun testKilometersToMeters() {
        assertEquals(1000.0, UnitConverter.kilometersToMeters(1.0), 0.001)
        assertEquals(500.0, UnitConverter.kilometersToMeters(0.5), 0.001)
    }

    @Test
    fun testGramsToKilograms() {
        assertEquals(1.0, UnitConverter.gramsToKilograms(1000.0), 0.001)
        assertEquals(0.5, UnitConverter.gramsToKilograms(500.0), 0.001)
    }

    @Test
    fun testKilogramsToGrams() {
        assertEquals(1000.0, UnitConverter.kilogramsToGrams(1.0), 0.001)
        assertEquals(500.0, UnitConverter.kilogramsToGrams(0.5), 0.001)
    }
}
