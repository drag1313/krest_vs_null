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



    void move() {

        for (char[] row : field) {
            Arrays.fill(row, '-');
        }

        for (int i = 0; i < 9; i++)
            while (true) {
                print('x');
                scan('x');
                if (c.checkAll(field, 'x') || c.checkAll(field, 'o')) {
                    break;
                }

                print('o');
                scan('o');
                if (c.checkAll(field, 'x') || c.checkAll(field, 'o')) {
                    break;
                }
            }
    }
}


