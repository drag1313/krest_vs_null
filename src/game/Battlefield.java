package game;


import java.util.Arrays;
import java.util.Scanner;


public class Battlefield {
    Check c = new Check();
    private char[][] field = new char[3][3];
    private char symbol;
    int n = 0;

    public Battlefield() {
        for (char[] row : field)

        {
            Arrays.fill(row, '-');
        }
    }

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

    private boolean win(char field[][], char symbol) {
        if (Check.checkAll(field, 'x') || Check.checkAll(field, 'o')) {
            if (symbol == 'x') {
                System.out.println("Победил первый игрок!");
            }
            if (symbol == 'o') {
                System.out.println("Победил второй игрок!");
            }

            return true;
        }
        if (n > 8) {
            System.out.println("Ничья! Победила дружба!");
            return true;
        }
        return false;

    }

    public void move() {


        while (true) {
            print('x');
            scan('x');
            n++;
            if (win(field, 'x')) {
                break;
            }


            print('o');
            scan('o');
            n++;
            if (win(field, 'o')) {
                break;
            }
        }
    }
}


