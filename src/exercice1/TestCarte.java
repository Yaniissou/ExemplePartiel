package exercice1;

import exercice1.exception.PlatException;
import exercice1.utilitaire.CarteUtilitaire;


/**
 *  Classe de test pour la création d'une carte
 *
 */
public class TestCarte {
    
    public static void main(String[] args) throws PlatException {
        
        /////// Création des plats
        // Création des entrées
        exercice1.Plat entree1 = new exercice1.Plat("Taboulé", 2);
        exercice1.Plat entree2 = new exercice1.Plat("Croquettes de carottes", 4);
        exercice1.Plat entree3 = new exercice1.Plat("Chèvre en feuilleté", 6);

        // Création des plats principaux
        exercice1.Plat plat1 = new exercice1.Plat("Paupiette de veau aux olives et son gratin", 4);
        exercice1.Plat plat2 = new exercice1.Plat("Filet de lieu sauce armoricaine et son riz", 6);
        exercice1.Plat plat3 = new exercice1.Plat("Crumble de ravioles/épinards", 8);

        // Création des desserts
        exercice1.Plat dessert1 = new exercice1.Plat("Fondant au chocolat", 2);
        exercice1.Plat dessert2 = new exercice1.Plat("Flan pâtissier traditionnel", 3);
        exercice1.Plat dessert3 = new exercice1.Plat("Brownies aux noix", 4);

        /////// Création des menus
        MenuDeBase menu1 = new MenuDeBase("Essentiel", entree1, plat1);
        MenuDeBase menu2 = new MenuDeBase("Inspiration", entree2, plat2);
        MenuComplet menu3 = new MenuComplet("Gourmand", entree3, plat3, dessert3);

        /////// Création de la carte
        Carte carte = new Carte();

        // Ajout des entrées
        carte.addEntree(entree1);
        carte.addEntree(entree2);
        carte.addEntree(entree3);

        // Ajout des plats principaux
        carte.addPlatPrincipal(plat1);
        carte.addPlatPrincipal(plat2);
        carte.addPlatPrincipal(plat3);

        // Ajout des desserts
        carte.addDessert(dessert1);
        carte.addDessert(dessert2);
        carte.addDessert(dessert3);

        // Ajout des menus
        carte.addMenu(menu1);
        carte.addMenu(menu2);
        carte.addMenu(menu3);

        ///// Affichage de la carte
        exercice1.utilitaire.CarteUtilitaire.printCarte(carte);
    }
}
