public class Array2 {
    public static void main(String[] args) {
        int[] array = new int[100]; // Создаем пустой целочисленный массив длиной 100

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Заполняем массив значениями от 1 до 100
        }

        System.out.println("Массив, заполненный значениями от 1 до 100:");
        printArray(array); // Выводим заполненный массив
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
