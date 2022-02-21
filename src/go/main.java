package go;

import bo.Bateau;
import bo.Cellule;
import bo.Grille;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    private static int x;
    private static int y;
    private static int J1 = 0;
    private static int J2 = 1;
    public static int J ;


    public static void main(String[] args) {
        Grille j1 = new Grille();// Grille du joueur 1;
        Grille j2 = new Grille();// Grille du joueur 2;
        Bateau pa = new Bateau("porte-avion", 5,"pa");
        Cellule p = new Cellule(pa);
        Bateau cr = new Bateau("croisière", 4,"cr");
        Cellule c = new Cellule(cr);
        Bateau cto = new Bateau("contre_torpieur", 3,"ct");
        Cellule o = new Cellule(cto);
        Bateau s_m = new Bateau("sous_marin", 3,"sm");
        Cellule s = new Cellule(s_m);
        Bateau to = new Bateau("torpieur", 2,"to");
        Cellule t = new Cellule(to);
        Bateau nu = new Bateau(null,1,"..");
        Cellule n = new Cellule(nu);
        List<Cellule> ba = new ArrayList<>(); // liste des bateau dans un tableau
        ba.add(p);
        ba.add(c);
        ba.add(o);
        ba.add(s);
        ba.add(t);
        for (int i =0;i <5;i++){
            Random random = new Random(); // création d'un choix au hasard
            boolean continuer = false;
            while(!continuer) {
                int rn = random.nextInt(10); //random number pour l'abscisse;
                int ro = random.nextInt(10); // random number pour l'ordonnée;
                int rp = (int) Math.round(Math.random()); // random number pour le positionnement;
                if (j1.check_position(ba.get(i), rn, ro, rp)) {
                    continuer = true;
                    j1.addB(ba.get(i), rn, ro, rp); // ba.get(i) permet de recupérer des valeurs dans le tableau ba
                    break;
                }
            }
        }
        for (int i =0;i <5;i++){
            Random random = new Random();
            boolean continuer = false;
            while(!continuer) {
                int rn = random.nextInt(10);
                int ro = random.nextInt(10);
                int rp = (int) Math.round(Math.random());
                if (j2.check_position(ba.get(i), rn, ro, rp)) {
                    continuer = true;
                    j2.addB(ba.get(i), rn, ro, rp);
                    break;
                }
            }
        }
        System.out.println("c'est la grille du joueur 1");
        j1.showGrid1();
        System.out.println("\n");
        System.out.println("c'est la grille du joueur 2");
        j2.showGrid1();
        boolean vrai = true;
        int nombre1 = 0;
        int nombre2 = 0;
        while (vrai) {
            while (x < 9 || x > 0 || y < 9 || y > 0) {
                System.out.println("entrez l'abscisse");
                Scanner cord = new Scanner(System.in);
                x = cord.nextInt();
                System.out.println("Entrez l'ordonné");
                y = cord.nextInt();
                if (x > 9 || x < 0 || y > 9 || y < 0) {
                    System.out.println("les valeurs doivent être comprisent entre 0 et 9");
                }else {
                    if (J == J1) {

                        if (j2.maGrille[y][x]==p){
                            System.out.println("tu as touché un porte-avion");
                        }if (j2.maGrille[y][x]==c){
                            System.out.println("tu as touché une croisière");
                        }if (j2.maGrille[y][x]==o){
                            System.out.println("tu as touché un contre-torpieur");
                        }if (j2.maGrille[y][x]==s){
                            System.out.println("tu as touché un sous-marin");
                        }if (j2.maGrille[y][x]==t){
                            System.out.println("tu as touché un torpieur");
                        }
                        j2.remove(n, x, y);
                        nombre2++;
                        j2.showGrid1();
                        J= J2;
                    }else if(J== J2){

                        if (j1.maGrille[y][x]==p){
                            System.out.println("tu as touché un porte-avion");
                        }if (j1.maGrille[y][x]==c){
                            System.out.println("tu as touché une croisière");
                        }if (j1.maGrille[y][x]==o){
                            System.out.println("tu as touché un contre-torpieur");
                        }if (j1.maGrille[y][x]==s){
                            System.out.println("tu as touché un sous-marin");
                        }if (j1.maGrille[y][x]==t){
                            System.out.println("tu as touché un torpieur");
                        }
                        j1.remove(n, x, y);
                        nombre1++;
                        j1.showGrid1();
                        J=J1;
                }
            }

            }
            if (nombre1 == 17){
                System.out.println("le joueur 2 à gagné il a coulé tout les bateau du joueur 1");
                break;
            }
            else if (nombre2 == 17){
                System.out.println("le joueur 1 à gagné il a coulé tout les bateau du joueur 2");
                break;
            }


        }
    }
    }
