package com.gla.TemperatureAlert;
import java.util.function.Predicate;
public class TemperatureAlert {
    public static void main(String[] args) {
        double temperature = 38.5;
        double threshold = 37.0;
        Predicate<Double> isHighTemp = temp -> temp > threshold;
        if (isHighTemp.test(temperature)) {
            System.out.println("🚨 Alert! High temperature detected: " + temperature);
        } else {
            System.out.println("✅ Temperature is normal: " + temperature);
        }
    }
}