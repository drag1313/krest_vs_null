package game;

import java.util.Arrays;
import java.util.Scanner;


class Battlefield {

    private char[][] field = new char[3][3];
    private Check c = new Check();
    private char symbol;


    private void print(char symbol) {
        for (char[] aField : field) {
            System.out.println(Arrays.toString(aField));
        }
        if (symbol == 'x') {
            System.out.println("{Ходит первый игрок.");
        } else {
            System.out.println("{Ходит второй игрок.");
        }
    }


    private void scan(char symbol) {
        Scanner in = new Scanner(System.in);
        int in1 = in.nextInt();
        int in2 = in.nextInt();
        in1--;
        in2--;
        field[in1][in2] = symbol;
    }

    private boolean checkAll(char field[][], char symbol) {
        if (c.checkString(field, symbol) || c.checkColums(field, symbol) || c.checkDiagonal2(field, symbol) || c.checkDiagonal1(field, symbol)) {
            return true;
        } else if(symbol=='x'){
            System.out.println("Победил первый игрок!");
            return false;
        }else {
            System.out.println("Победил второй игрок!");
            return false;
        }


    }

    void move() {

        for (char[] row : field) {
            Arrays.fill(row, '-');
        }

        for (int i = 0; i < 9; i++)
            while (checkAll(field, symbol)) {
                print('x');
                scan('x');
                checkAll(field, 'x');

                print('o');
                scan('o');
                checkAll(field, 'o');

            }
    }
}


