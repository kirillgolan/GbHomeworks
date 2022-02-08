public class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -10;
        int c = a + b;
        if ( c >= 0 ) {
            System.out.println("Sum is positive");
        }
        else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int value = 1000;
        if (value < 0) {
            System.out.println("RED");
        }
        if (value > 0 && value <= 100) {
            System.out.println("YELLOW");
        }
        if (value > 100) {
            System.out.println("GREEN");
        }
    }

    public static void compareNumbers() {
        int a = 400;
        int b = 4;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }

    }



}
