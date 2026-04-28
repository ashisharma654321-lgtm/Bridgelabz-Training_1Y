package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text:");
            String text = sc.nextLine();

            text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

            String[] words = text.split("\\s+");

            Map<String, Integer> freqMap = new HashMap<>();

            for (String word : words) {
                if (word.isEmpty()) continue;

                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }

            System.out.println("Word Frequency:");
            System.out.println(freqMap);

        }
    }
