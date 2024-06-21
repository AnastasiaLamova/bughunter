package WordAnalyzer;

public class Main {
    public static void main(String[] args) {
        String[] words = {"яблоко", "банан", "яблоко", "апельсин", "виноград", "банан", "киви", "манго", "грейпфрут",
                "авокадо", "личи", "киви"};
        WordAnalyzer analyzer = new WordAnalyzer(words);

        analyzer.displayUniqueWords();
        System.out.println();
        analyzer.displayWordCounts();
    }
}