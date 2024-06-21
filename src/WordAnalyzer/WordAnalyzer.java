package WordAnalyzer;

import java.util.HashMap;
import java.util.Map;

public class WordAnalyzer {
    private String[] words;

    public WordAnalyzer(String[] words) {
        this.words = words;
    }

    public void displayUniqueWords() {
        Map<String, Integer> wordCount = countWordOccurrences();

        System.out.println("Уникальные слова:");
        for (String word : wordCount.keySet()) {
            System.out.println(word);
        }
    }

    public void displayWordCounts() {
        Map<String, Integer> wordCount = countWordOccurrences();

        System.out.println("Количество встреч каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private Map<String, Integer> countWordOccurrences() {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}