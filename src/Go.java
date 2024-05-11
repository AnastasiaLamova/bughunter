public class Go {
    public static void printTextMultipleTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        String text = "Привет, только вперед!!!"; // Текст для вывода
        int numberOfTimes = 3; // Число раз, сколько нужно вывести текст

        printTextMultipleTimes(text, numberOfTimes);
    }
}
