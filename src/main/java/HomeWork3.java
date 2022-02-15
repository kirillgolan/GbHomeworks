/**
 * Java 1. HomeWork #3
 *
 * @author KirillGolan
 * @version 15.02.22.
 */
import java.util.Arrays;
public class HomeWork3 {
    public static void main(String[] args) {
        firstArray();
        borderMethod();
        fillArray();
        borderMethod();
        lessSixX2();
        borderMethod();
        digonalMatrix();
        borderMethod();
        returnArray(8, 10);
        borderMethod();
        minMaxArray();
    }

    static void firstArray() {
        int[] arr = {0, 1, 1, 1, 0, 1, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
            //Так и не понял как вывести изменённые значения с помощью метода toString, буду рад если подскажите
            // System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void borderMethod() {
        System.out.println("\n");
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = k + 1;
            System.out.print(arr[k] + " ");
        }
    }

    static void lessSixX2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] < 6) {
                arr[l] = arr[l] * 2;
            }
            System.out.print(arr[l] + " ");
        }
    }

    static void digonalMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                if (i == 0 && j == 2) {
                    matrix[i][j] = 1;
                }
                if (i == 2 && j == 0) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void returnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }

    static void minMaxArray() {
        int[] arr = {11, 4, -67, 3, 42, 39};
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum is " + max + "\n" + "minimum is " + min);
    }

}
