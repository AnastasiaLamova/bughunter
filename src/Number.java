public class Number {
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное или равно нулю");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void main(String[] args) {
        int number = -10; // Произвольное число для проверки

        checkNumber(number);
    }
}
