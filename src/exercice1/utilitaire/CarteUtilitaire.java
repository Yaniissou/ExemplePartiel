package exercice1.utilitaire;

import exercice1.Carte;

public class CarteUtilitaire {


    /**
     * Affiche la carte sur le terminal
     *
     * @param carte
     */
    public static void printCarte(Carte carte) {

        // Afficher les menus
        for (int i = 0; i < carte.getMenus().size(); i++) {
            System.out.println(carte.getMenus().get(i).getDescription());
        }
        System.out.println(" ");

        // Afficher les entrées
        System.out.println("Nos entrées :");
        for (int i = 0; i < carte.getMenus().size(); i++) {
            System.out.println("\t" + carte.getMenus().get(i).getEntree().getNom() + " - " + carte.getMenus().get(i).getEntree().getPrixDeVente() + " euros");
        }
        System.out.println(" ");

        // Afficher les plats
        System.out.println("Nos plats : ");
        for (int i = 0; i < carte.getMenus().size(); i++) {
            System.out.println("\t" + carte.getMenus().get(i).getPlatPrincipal().getNom() + " - " + carte.getMenus().get(i).getPlatPrincipal().getPrixDeVente() + " euros");
        }
        System.out.println(" ");

        // Afficher les desserts
        System.out.println("Nos desserts : ");
        for (int i = 0; i < carte.getDesserts().size(); i++) {
            System.out.println("\t" + carte.getDesserts().get(i).getNom() + " - " + carte.getDesserts().get(i).getPrixDeVente() + " euros");

        }
    }


    /**
     * Cette méthode renvoie l'entier le plus proche supérieur ou égal à l'argument
     * <p>
     * NE PAS MODIFIER
     *
     * @param valeur
     * @return entier le plus proche supérieur ou égal à l'argument
     */
    public static double arrondi(double valeur) {
        return Math.ceil(valeur);
    }

    /**
     * Transforme la chaine de caractères passée en paramètre :
     * - Première lettre en majuscule
     * - Le reste en minuscule
     *
     * @param chaine de caractères
     * @return chaine premier caractère majuscule suivi de minuscule
     */
    public static String capitalize(String chaine) {
        return chaine.substring(0, 1).toUpperCase() + chaine.substring(1, chaine.length()).toLowerCase();
    }
}
