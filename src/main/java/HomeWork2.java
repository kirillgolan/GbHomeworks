/**
 * Java 1. HomeWork #2
 *
 * @author KirillGolan
 * @version 11.02.22.
 */
public class HomeWork2 {
    public static void main(String[] args) {
       boolean result = within10and20(6,70);
       // результат, как я понял можно не выводить, но для наглядности выведу.
        System.out.println(result);
        positiveOrNegative( -10);
        boolean result1 = positiveOrNot(10);
        System.out.println(result1);
        printNumberString();
        boolean result2 = leapYear(2012);
        System.out.println(result2);

    }

    static boolean within10and20(int a , int b) {
        return (a + b >= 10 && a + b <=20);
    }

    static void positiveOrNegative(int value) {
        System.out.println(value >= 0? "Positive" : "Negative");
    }

    static boolean positiveOrNot(int value1) {
        return  (value1 < 0);
    }

    static void printNumberString() {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Wery important string");
        }
    }

    static boolean leapYear(int year) {
        return  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

}