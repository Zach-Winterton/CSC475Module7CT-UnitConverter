package com.example.unitconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputValue = findViewById<EditText>(R.id.inputValue)
        val convertButton = findViewById<Button>(R.id.convertButton)
        val resultText = findViewById<TextView>(R.id.resultText)
        val conversionSpinner = findViewById<Spinner>(R.id.conversionTypeSpinner)

        val conversions = resources.getStringArray(R.array.conversion_types)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, conversions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        conversionSpinner.adapter = adapter

        convertButton.setOnClickListener {
            val value = inputValue.text.toString().toDoubleOrNull() ?: 0.0
            val selectedConversion = conversionSpinner.selectedItem.toString()
            val result = when (selectedConversion) {
                "Celsius to Fahrenheit" -> UnitConverter.celsiusToFahrenheit(value)
                "Fahrenheit to Celsius" -> UnitConverter.fahrenheitToCelsius(value)
                "Meters to Kilometers" -> UnitConverter.metersToKilometers(value)
                "Kilometers to Meters" -> UnitConverter.kilometersToMeters(value)
                "Grams to Kilograms" -> UnitConverter.gramsToKilograms(value)
                "Kilograms to Grams" -> UnitConverter.kilogramsToGrams(value)
                else -> 0.0
            }
            resultText.text = "Result: $result"
        }
    }
}