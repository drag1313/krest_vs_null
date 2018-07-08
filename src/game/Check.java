package game;
public class Check {


    public static boolean checkAll(char field[][],char symbol) {
        int z=0;
        int NumberOfMove=1;
        if (NumberOfMove<4) {
            for (int i = 0; i < 3; i++) {
                if (field[i][i] == 'x') {
                    z++;
                    if (z % 3 == 0) {
                        return false;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                if (field[i][3 - i] ==symbol) {
                    z++;
                    if (z % 3 == 0) {
                        return false;
                    }
                }
            }

            for (int x = 0;x<field.length;x++) {
                for (int y = 0; y < field.length; y++) {
                    if (field[x][y] == symbol) {
                        z++;
                        if (z % 3 == 0) {
                            return false;
                        }
                    }
                }
            }
            for (int x = 0;x<field.length; x++) {
                for (int y = 0; y < field.length; y++) {
                    if (field[y][x] == symbol) {
                        z++;
                        if (z % 3 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        NumberOfMove++;
        return true;
    }

}
