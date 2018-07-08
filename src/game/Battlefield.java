package game;

import java.util.Arrays;
import java.util.Scanner;

import static game.Check.checkAll;

class Battlefield {

    private char[][] field = new char[3][3];
    private Check c = new Check();
    private int in1;
    private int in2;
    private char symbol;



    private void scan(char symbol){
        Scanner in = new Scanner(System.in);
        in1 = in.nextInt();
        in2 = in.nextInt();
        in1--;
        in2--;
        field[in1][in2] = symbol;
    }

    void move() {

        for (char[] row : field) {
            Arrays.fill(row, '-');
        }
        for (char[] aField : field) {
            System.out.println(Arrays.toString(aField));
        }

        for (int i = 0; i < 9; i++)
            while (checkAll(field,symbol)) {
                System.out.println("{Ходит первый игрок.");
                scan('x');
                field[in1][in2] = symbol;
                for (char[] aField : field) {
                    System.out.println(Arrays.toString(aField));
                }
                System.out.println("{Ходит второй игрок.");
                scan('o');
                field[in1][in2] = symbol;
                for (char[] aField : field) {
                    System.out.println(Arrays.toString(aField));
                }
            }
    }
}


