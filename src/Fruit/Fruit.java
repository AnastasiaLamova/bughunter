package Fruit;

import java.util.*;

public class Fruit {
    public static void main(String[] args) {
        String[] wordsArray = {"яблоко", "банан", "яблоко", "апельсин", "виноград", "банан", "киви", "манго", "грейпфрут",
                "авокадо", "личи", "киви"};

        // Создание списка для хранения уникальных слов
        Set<String> uniqueWords = new HashSet<>();

        // Создание карты для хранения слов и их частоты встречаемости
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Заполнение списка уникальных слов и подсчет частоты встречаемости
        for (String word : wordsArray) {
            uniqueWords.add(word);
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }

        // Вывод уникальных слов
        System.out.println("Уникальные слова:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        // Вывод частоты встречаемости каждого слова
        System.out.println("\nЧастота встречаемости каждого слова:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
