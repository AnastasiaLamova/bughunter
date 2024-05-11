public class len {
    public static void main(String[] args) {
        int len = 5;
        int InitialValue = 10;

        int[] newArray = createArray(len, InitialValue);

        // Вывод полученного массива
        System.out.println("Созданный массив:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static int[] createArray(int len, int InitialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = InitialValue;
        }
        return array;
    }
}
