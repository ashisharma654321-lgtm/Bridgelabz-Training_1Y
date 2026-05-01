package StreamAPI;
import java.util.*;

    public class Ques4 {
        public static void main(String[] args) {
            List<Double> sensorReadings = Arrays.asList(
                    24.9, 45.2,43.8, 12.3, 98.6, 55.0, 30.4
            );

            double threshold = 49.0;
            sensorReadings.stream()
                    .filter(reading -> reading > threshold)
                    .forEach(reading ->
                            System.out.println("Alert! High sensor reading: " + reading)
                    );
        }
    }

