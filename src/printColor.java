public class printColor {
    public static void printColor() {
        int value = 75; // Произвольное значение переменной

        if (value < 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void main(String[] args) {
        printColor();
    }
}
