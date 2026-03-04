import java.util.*;
import java.io.*;

public class WordAnalyzer {
    public static void main(String[] args) {
        // Change this to your actual file name
        String fileName = "data.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        System.out.println("--- Reading from: " + fileName + " ---");

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                // Remove punctuation and convert to lowercase
                String word = fileScanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
                
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            // Display results
            System.out.println("\n--- Word Frequency Results ---");
            wordCount.forEach((word, count) -> {
                System.out.printf("%-15s : %d%n", word, count);
            });

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}