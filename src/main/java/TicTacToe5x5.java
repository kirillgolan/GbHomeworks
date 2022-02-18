/**
 * Java 1. HomeWork #4
 *
 * @author KirillGolan
 * @version 18.02.22.
 */
import java.util.Random;
import java.util.Scanner;

class TicTacToe5x5 {
    Random random;
    Scanner scanner;
    char[][] table;

    public static void main(String[] args){
        new TicTacToe5x5().game();
    }

    TicTacToe5x5() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[5][5];
    }

    void game() {
        initTable();
        printTable();
        System.out.println("Make line of 4 for the win");
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
        for (int y = 0; y < 5 ; y++) {
            for (int x = 0; x < 5 ; x++) {
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for (int y = 0; y < 5 ; y++) {
            for (int x = 0; x < 5 ; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1...5]:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = 'X';
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(5);
            y = random.nextInt(5);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }

    boolean isCellValid(int x, int y) {
        if (y < 0 || y > 4 || x < 0 || x > 4) {
            return false;
        }
        return table[x][y] == '.';
    }

    boolean chekWin(char ch) {
        //диагональные линии
        if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch && table[3][3] == ch) || (table[4][4] == ch && table[1][1] == ch && table[2][2] == ch && table[3][3] == ch))  return true;
        if ((table[0][1] == ch && table[1][2] == ch && table[2][3] == ch && table[3][4] == ch) || (table[4][3] == ch && table[1][0] == ch && table[2][1] == ch && table[3][2] == ch))  return true;

        if ((table[4][0] == ch && table[3][1] == ch && table[2][2] == ch && table[1][3] == ch) || (table[0][4] == ch && table[3][1] == ch && table[2][2] == ch && table[1][3] == ch)) return true;
        if ((table[3][0] == ch && table[2][1] == ch && table[1][2] == ch && table[0][3] == ch) || (table[4][1] == ch && table[3][2] == ch && table[2][3] == ch && table[1][4] == ch)) return true;

        //горизонтальные линии
        for (int i = 0; i < table.length; i++) {
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch && table[i][3] == ch) || (table[i][4] == ch && table[i][1] == ch && table[i][2] == ch && table[i][3] == ch)) {
                return true;
            }
        }

        //вертикальные линии
        for (int i = 0; i < table.length; i++) {
            if ((table[0][i] == ch && table[1][i] == ch && table[2][i] == ch && table[3][i] == ch) || (table[4][i] == ch && table[1][i] == ch && table[2][i] == ch && table[3][i] == ch)) {
                return true;
            }
        }
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}