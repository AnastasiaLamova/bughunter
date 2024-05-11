public class Negative {
    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = -5; // Произвольное число для проверки

        boolean result = isNegative(number);

        if (result) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное или равно нулю");
        }
    }
}
