package bo;

public class Joueur {
    private String name;
    private int nbt=0;

    public Joueur(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public int getNbt() {
        return nbt;
    }
}
