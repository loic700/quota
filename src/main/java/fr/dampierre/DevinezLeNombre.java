package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class DevinezLeNombre {
    public static void main(String[] args) {
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(100) + 1; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.print("Entrez un nombre : ");

        int proposition = sc.nextInt();

        System.out.println("Vous proposez : " + proposition);


        System.out.println("Le nombre auquel je pensais était : " + nombreAleatoire);

        int difference = Math.abs(nombreAleatoire - proposition);

        System.out.println("Vous étiez à " + difference + " de la bonne réponse.");

        sc.close();
    }
}
    
