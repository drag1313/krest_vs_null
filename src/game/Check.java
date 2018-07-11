package game;

class Check {

    boolean checkAll(char field[][], char symbol) {
        if (checkString(field, symbol) || checkColums(field, symbol) || checkDiagonal2(field, symbol) || checkDiagonal1(field, symbol))
            if (symbol == 'x') {
                System.out.println("Победил первый игрок!");
                return false;
            } else {
                System.out.println("Победил второй игрок!");
                return false;
            }
        return true;
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
        int z = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][3 - i] == symbol) {
                z++;
            }
            if (z == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean checkString(char field[][], char symbol) {
        int z = 0;
        for (char[] aField1 : field) {
            for (int y = 0; y < field.length; y++) {
                if (aField1[y] == symbol) {
                    z++;
                }
            }
        }
        if (z == 3) {
            return true;
        }
        return false;
    }

    private boolean checkColums(char field[][], char symbol) {
        int z = 0;
        for (int x = 0; x < field.length; x++) {
            for (char[] aField : field) {
                if (aField[x] == symbol) {
                    z++;
                }
            }
        }
        if (z == 3) {
            return true;
        }
        return false;
    }


}
