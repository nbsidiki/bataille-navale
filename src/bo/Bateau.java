package bo;

public class Bateau {
    private String name;
    private String abv =" . "; // abréviation du bateau dans la cellule qui est de base un point;


    public String getAbv() {
        return abv;
    }



    private int ndc; // ndc est le nombre de cellule

    public int getNdc() {
        return ndc;
    }

    public Bateau (String name, int ndc, String abv){
        this.name=name;
        this.ndc=ndc;
        this.abv=abv;

    }

    public String getName() {
        return name;
    }


}
