package game;
public class check {

    public void checkAll() {
        battlefield b=new battlefield();

        int z=0;
        char move='x';

        for (int i = 0; i < 3; i++) {
          if  (b.field[i][i]=='x'){
              z++;
              if(z==3){
                  b.check=true;
              }
          }
        }
        for (int i = 0; i < 3; i++) {
            if  (b.field[i][3-i]=='x'){
                z++;
                if(z==3){
                    b.check=true;
                }
            }
        }

        for (int x = 0; x < b.field.length; x++) {
            for (int y = 0; y < b.field.length;y++){
                if (b.field[x][y]=='x'){
                    z++;
                    if(z==3){
                        b.check=true;
                    }
                }
            }
        }
        for (int x = 0; x < b.field.length; x++) {
            for (int y = 0; y < b.field.length;y++){
                if (b.field[y][x]=='x'){
                    z++;
                    if(z==3){
                        b.check=true;
                    }
                }
            }
        }
    }
}
