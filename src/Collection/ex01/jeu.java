package Collection.ex01;

import Collection.ex01.formeGeoClass.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jeu {
    public static void main(String[] args) {
            boolean encore = true;
        Scanner scanner = new Scanner(System.in);
        List<FormeGeoInterface> arrayForm = new ArrayList<>();
        while (encore){
            System.out.println("Quelle forme voulez-vous (triangle, carré, rectangle, cercle, losange) ?");
            String reponse = scanner.next();
            switch (reponse){
                case "triangle":
                    System.out.println("Quelle est la longueur de la base ?");
                    Integer base = scanner.nextInt();
                    System.out.println("Quelle est la longueur de la hauteur ?");
                    Integer hauteur = scanner.nextInt();
                    Triangle triangle = new Triangle(hauteur,base);
                    arrayForm.add(triangle);
                    break;
                case "carre":
                    System.out.println("Quelle est la longueur du coté ?");
                    Integer cote = scanner.nextInt();
                    Carre carre = new Carre(cote);
                    arrayForm.add(carre);
                    break;
                case "rectangle":
                    System.out.println("Quelle est la longueur ?");
                    Integer longueur = scanner.nextInt();
                    System.out.println("Quelle est la largeur ?");
                    Integer largeur = scanner.nextInt();
                    Rectangle rectangle = new Rectangle(largeur,longueur);
                    arrayForm.add(rectangle);
                    break;
                case "cercle":
                    System.out.println("Quelle est la longueur du rayon ?");
                    Integer rayon = scanner.nextInt();
                    Cercle cercle = new Cercle(rayon);
                    arrayForm.add(cercle);
                    break;
                case "losange":
                    System.out.println("Quelle est la longueur de la grande diagonal ?");
                    Integer grandeDiago = scanner.nextInt();
                    System.out.println("Quelle est la longueur de la hauteur ?");
                    Integer petiteDiago = scanner.nextInt();
                    Losange losange = new Losange(grandeDiago,petiteDiago);
                    arrayForm.add(losange);
                    break;

            }
            System.out.println("Une autre forme (oui/non) ?");
            String reponse2 = scanner.next();
            switch (reponse2){
                case "oui":
                    continue;

                case "non":
                    encore = false;
                    break;
            }
        }
        System.out.println("Les formes saisies sont :");
        for (FormeGeoInterface formeGeoInterface : arrayForm) {
            System.out.println("Forme" + formeGeoInterface);
        }
    }
}
