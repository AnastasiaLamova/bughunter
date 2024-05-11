public class Year {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // Год високосный
        } else {
            return false; // Год не високосный
        }
    }

    public static void main(String[] args) {
        int year = 2024; // Год для проверки (можно задать любой год)

        boolean result = isLeapYear(year);

        if (result) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
}
