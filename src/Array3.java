public class Array3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Заданный массив

        System.out.println("Исходный массив:");
        printArray(array); // Выводим исходный массив

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2; // Умножаем числа меньше 6 на 2
            }
        }

        System.out.println("\nМассив после преобразования:");
        printArray(array); // Выводим измененный массив
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
