package game;
public class Check {

    public boolean checkAll() {
        Battlefield b=new Battlefield();

        int z=0;
        char move='x';

        for (int i = 0; i < 3; i++) {
          if  (getField[i][i]==){
              z++;
              if(z==3){
                  return =true;
              }
          }
        }
        for (int i = 0; i < 3; i++) {
            if  (b.field[i][3-i]==){
                z++;
                if(z==3){
                    return true;
                }
            }
        }

        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < b.field.length;y++){
                if (b.field[x][y]=='x'){
                    z++;
                    if(z==3){
                        return =true;
                    }
                }
            }
        }
        for (int x = 0; x < field.length; x++) {
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
