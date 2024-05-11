public class Array4 {
    public static void main(String[] args) {
        int n = 5; // Размер квадратного массива (пусть будет 5x5)
        int[][] array = new int[n][n]; // Создаем квадратный двумерный массив

        // Заполнение главной диагонали фигурой (пример для наглядности)
        for (int i = 0; i < n; i++) {
            array[i][i] = i + 1;
        }

        // Вывод двумерного массива
        System.out.println("Двумерный массив с заполненной диагональной фигурой:");
        printArray(array);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}