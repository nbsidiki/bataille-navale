package bo;

public class Grille {
    public Cellule[][] maGrille;
    public Cellule[][] saGrille;

    public Grille() {
        maGrille = new Cellule[10][10];
        saGrille = new Cellule[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                maGrille[i][j] = new Cellule(null);
                saGrille[i][j] = new Cellule(null);
            }

        }
    }public boolean check_position(Cellule b, int x, int y, int positionnement){
        boolean result = false;
        if (positionnement == 1 && (b.getB().getNdc() + x) < 10) {
            result = true;
            for (int i = x; i < b.getB().getNdc() + x; i++) {
                if(maGrille[i][y].getB() != null){
                    result =false;
                    break;
                }
            }
        }
        if (positionnement == 0 && (b.getB().getNdc() + y) < 10) {
            result= true;
            for (int i = y; i < b.getB().getNdc() + y; i++) {
                if (maGrille[x][i].getB() != null){
                    result = false;
                    break;
                }
            }

        }
        return result;
    }
boolean check_cellule(int x, int y){
        boolean result = false;
     if(x < 10 && y < 10) {
         if( maGrille [y][x].getB() != null){
             result = true;
         }
     }
     else {
         System.out.println("les coordonnées ne sont pas bons");
     }
     return result;
}
public void remove(Cellule b,int x, int y){
    if(x < 10 && y < 10) {
        if(check_cellule(x,y)){
            maGrille [y][x] = b;
        }
        else{
            System.out.println("vous avez raté votre tire");
        }
    }
    else {
        System.out.println("les coordonnées ne sont pas bons");
    }
}
/*boolean Victoire(Grille m){
        boolean result = false;
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if(m[i][j]== )
        }
    }
}*/
    public void addB(Cellule b, int x, int y, int positionnement)/*ndc c'est le nombre de cellulle*/ {
        if (maGrille[x][y].getB() == null && x < 10 && y < 10 ) {
            if (positionnement == 1) {
                if(b.getB().getNdc()+ x < 10) {
                    for (int i = x; i < b.getB().getNdc() + x; i++) {
                        maGrille[i][y] = b;
                    }
                }
                else{
                    System.out.println("les coordonnées ne sont pas bons");
                }
            }

            if (positionnement == 0) {
                if (b.getB().getNdc()+y < 10) {
                    for (int i = y; i < b.getB().getNdc() + y; i++) {
                        maGrille[x][i] = b;
                    }
                }
                else {
                    System.out.println("les coordonnées ne sont pas bons");
                }

                }

            }
        else{
            System.out.println("il y'a déja un bateau sur cet emplacement");
        }
        }

        public void showGrid1() {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("| "+maGrille[i][j]+" ");
                    if (j == 9) {
                        System.out.println("|");
                    }
                }

            }
        }
        public void showGrid2() {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(saGrille[i][j]);
                    if (j == 9) {
                        System.out.println("");
                    }

                }

            }

        }

    }


