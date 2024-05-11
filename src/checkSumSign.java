public class checkSumSign {
    public static void checkSumSign() {
        int a = 10; // Произвольное значение переменной a
        int b = -5; // Произвольное значение переменной b

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        checkSumSign();
    }
}
