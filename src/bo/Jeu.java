package bo;

import java.util.Scanner;

public class Jeu {
    private String name;

    public Jeu(String name){
        this.name=name;
    }

public void Jouer(Joueur name) {
        boolean result=false;
        System.out.println("entrez l'abscisse");
    Scanner cord = new Scanner(System.in);
    int x = cord.nextInt();
    System.out.println("Entrez l'ordonné");
    int y = cord.nextInt();
    if (x>9 || x<0 || y>9 || y<0){
        System.out.println("les valeurs doivent être comprisent entre 0 et 9");
    }else{
        result= true;
    }

    }



}


