package game;

class Check {

    private int z = 0;


    boolean checkDiagonal1(char field[][], char symbol) {
        for (int i = 0; i < 3; i++) {
            if (field[i][i] == symbol) {
                z++;
                if (z == 3) {
                    return false;
                }
            }
        }
        z = 0;
        return true;
    }

    boolean checkDiagonal2(char field[][], char symbol) {

        for (int i = 0; i < 3; i++) {
            if (field[i][3 - i] == symbol) {
                z++;
                if (z == 3) {
                    return false;
                }
            }
        }
        z = 0;
        return true;
    }

    boolean checkString(char field[][], char symbol) {

        for (char[] aField1 : field) {
            for (int y = 0; y < field.length; y++) {
                if (aField1[y] == symbol) {
                    z++;
                    if (z == 3) {
                        return false;
                    }
                }
            }
        }
        z = 0;
        return true;
    }

    boolean checkColums(char field[][], char symbol) {
        for (int x = 0; x < field.length; x++) {
            for (char[] aField : field) {
                if (aField[x] == symbol) {
                    z++;
                    if (z == 3) {
                        return false;
                    }
                }
            }
        }
        z = 0;
        return true;
    }


}
