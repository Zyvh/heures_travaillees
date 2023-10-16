package fr.nassim;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Variables.
        int salaireParHeure = 15;
        int heuresMax = 40;
        int salaire;
        int nbHeureTravaillee;

        // Demande du nombre d'heure travaillée.
        Scanner sc = new Scanner(System.in);

        // **INSTRUCTION WHILE** :

        // System.out.println("Donne moi le nombre d'heure travaillée :");
        // nbHeureTravaillee = sc.nextInt();

        // // TANT QUE le nombre d'heure travaillée n'est pas entre 0 et 42 alors
        // redemande
        // // le nb d'heure travaillée.
        // while (nbHeureTravaillee < 0 || nbHeureTravaillee > heuresMax) {
        // System.out.println("Pas possible ! essaie encore");
        // nbHeureTravaillee = sc.nextInt();
        // }

        // **INSTRUCTION DO WHILE** :

        do {
            System.out.println("Combien d'heures travaillées cette semaine ? (entre 0 et " + heuresMax + ") : ");
            nbHeureTravaillee = sc.nextInt();
            if (nbHeureTravaillee < 0 || nbHeureTravaillee > heuresMax)
                ;
            {
                System.out.println(
                        "Entrée invalide, votre nombre d'heures travaillées doit être entre 0 et " + heuresMax);
            }
        } while (nbHeureTravaillee < 0 || nbHeureTravaillee > heuresMax);

        // fermeture du clavier
        sc.close();

        // Le nb d'heure est entre 0 et 42 affichage donc affichage du salaire.
        salaire = nbHeureTravaillee * salaireParHeure;
        System.out.println("Votre salaire sera de " + salaire + " euros.");

    }

}