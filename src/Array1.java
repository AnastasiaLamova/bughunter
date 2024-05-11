public class Array1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // Заданный массив из 0 и 1

        System.out.println("Исходный массив:");
        printArray(array); // Выводим исходный массив

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }

        System.out.println("\nИзмененный массив:");
        printArray(array); // Выводим измененный массив
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
