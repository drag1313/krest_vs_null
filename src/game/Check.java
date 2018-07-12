package game;

class Check {

    boolean checkAll(char field[][], char symbol) {
        if (checkString(field, symbol) || checkColums(field, symbol) || checkDiagonal2(field, symbol) || checkDiagonal1(field, symbol)){
                return true;
            }
        return false;
    }

    private boolean checkDiagonal1(char field[][], char symbol) {
        int z = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][i] == symbol) {
                z++;
            }
            if (z == 3) {
                return true;
            }
        }
        return false;

    }

    private boolean checkDiagonal2(char field[][], char symbol) {
        int b = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][2 - i] == symbol) {
                b++;
            }
            if (b == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean checkString(char field[][], char symbol) {
        int k = 0;
        for (int x=0;x<field.length;x++) {
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] == symbol) {
                    k++;
                }
            }
        }
        if (k == 3) {
            return true;
        }
        return false;
    }

    private boolean checkColums(char field[][], char symbol) {
        int f = 0;
        for (int x=0;x<field.length;x++) {
            for (int y = 0; y < field[x].length; y++) {
                if (field[y][x] == symbol) {
                    f++;
                }
            }
        }
        if (f == 3) {
            return true;
        }
        return false;
    }


}
