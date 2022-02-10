public class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 2, b = -10;
            System.out.println(a + b >= 0? "Sum is positive" : "Sum is negative");
    }

    static void printColor() {
        int value = 1000;
        if (value <= 0) {
            System.out.println("RED");
        }
        if (value > 0 && value <= 100) {
            System.out.println("YELLOW");
        }
        else {
            System.out.println("GREEN");
        }
    }

    static void compareNumbers() {
        int a = 400, b = 4;
            System.out.println(a >= b? "a>=b" : "a<b");
    }
}
