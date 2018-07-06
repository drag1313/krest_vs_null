package game;

import java.util.Arrays;
import java.util.Scanner;

class battlefield {
    char[][] field = new char[3][3];
    check c =new check();
    private int in1;
    private int in2;
    boolean check=false;
        void move(boolean check) {

            for (char[] row : field) {
                Arrays.fill(row, '-');
            }

            for (char[] aField : field) {
                System.out.println(Arrays.toString(aField));
            }
            for (int i = 0; i < 9; i++)
                if (!check) {
                    System.out.println("{Ходит первый игрок.");
                    Scanner in = new Scanner(System.in);
                    in1 = in.nextInt();
                    in2 = in.nextInt();
                    in1--;
                    in2--;
                    field[in1][in2] = 'x';
                    for (char[] aField : field) {
                        System.out.println(Arrays.toString(aField));
                    }


                        System.out.println("{Ходит второй игрок.");
                        in1 = in.nextInt();
                        in2 = in.nextInt();
                        in1--;
                        in2--;
                        field[in1][in2] = '0';
                        for (char[] aField : field) {
                            System.out.println(Arrays.toString(aField));
                        }
                    }
                }
        }


