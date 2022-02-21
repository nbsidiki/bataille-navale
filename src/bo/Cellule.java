package bo;

public class Cellule {
    private Bateau b;
    private int x,y;

    @Override
    public String toString() {
        if(b==null){
        return " .";}
        else{
            return b.getAbv();
        }
    }

    public Cellule(Bateau b){
        this.b = b;
       ;
    }

    public Bateau getB() //permet de recuperer le bateau dans la cellule
    {
        return b;
    }
}
