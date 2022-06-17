package tp05.ex01;

import java.util.Scanner;

public class jeu {
    static Integer limiteDeCoup = 10;
    static Integer nbrChoisis;
    static Integer limiteMax = 100;
    static Integer nbrCourrant = limiteMax;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nbrChoisis = scanner.nextInt();
        for (int i = 0; i < limiteDeCoup; i++) {
            Integer trouve = limiteMax/2;

            if (trouve.equals(nbrChoisis)){
                System.err.println("GG");
                break;
            } else if (trouve < nbrChoisis) {
                nbrCourrant = limiteMax - trouve;
            } else {
                nbrCourrant = trouve;
            }
            System.out.println(i);
        }
    }
}
