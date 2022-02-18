/**
 * Java 1. HomeWork #4
 *
 * @author KirillGolan
 * @version 18.02.22.
 */
import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    Random random;
    Scanner scanner;
    char[][] table;

    public static void main(String[] args){
        new TicTacToe().game();
    }

    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (chekWin('X')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("DRAW");
                break;
            }
            turnAi();
            printTable();
            if (chekWin('o')) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("DRAW");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }

    void initTable() {
        for (int y = 0; y < 3 ; y++) {
            for (int x = 0; x < 3 ; x++) {
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for (int y = 0; y < 3 ; y++) {
            for (int x = 0; x < 3 ; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1...3]:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = 'X';
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }

    boolean isCellValid(int x, int y) {
        if (y < 0 || y > 2 || x < 0 || x > 2) {
            return false;
        }
        return table[x][y] == '.';
    }

    boolean chekWin(char ch) {
        //диагональные линии
        if (table[0][0] == ch && table[1][1] == ch &&table[2][2] == ch ) return  true;
        if (table[2][0] == ch && table[1][1] == ch &&table[0][2] == ch ) return  true;
        //горизонтальные линии
        for (int i = 0; i < table.length; i++) {
            if (table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) {
                return true;
            }
        }
        //вертикальные линии
        for (int i = 0; i < table.length; i++) {
            if (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch) {
                return true;
            }
        }
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}