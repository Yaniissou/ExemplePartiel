package exercice1;

import java.awt.*;
import java.util.ArrayList;

public class Carte {
    //Attributs
    private ArrayList<MenuDeBase> menus;
    private ArrayList<Plat> entrees;
    private ArrayList<Plat> platsPrincipaux;
    private ArrayList<Plat> desserts;

    //Constructeur
    public Carte(){
        this.menus = new ArrayList<>();
        this.entrees = new ArrayList<>();
        this.platsPrincipaux = new ArrayList<>();
        this.desserts = new ArrayList<>();
    }

    //Méthodes
    public void addEntree(Plat entree){
        this.entrees.add(entree);
    }

    public void addPlatPrincipal(Plat platPrincipal){
        this.platsPrincipaux.add(platPrincipal);
    }

    public void addDessert(Plat dessert){
        this.desserts.add(dessert);
    }

    /**
     * Ajouter un menu à la carte
     * @param menuDeBase Le menu ajouté à la carte
     */
    public void addMenu(MenuDeBase menuDeBase){
        this.menus.add(menuDeBase);
    }

    //Getters
    public ArrayList<Plat> getEntrees() {
        return entrees;
    }

    public ArrayList<Plat> getPlatsPrincipaux() {
        return platsPrincipaux;
    }

    public ArrayList<Plat> getDesserts() {
        return desserts;
    }

    public ArrayList<MenuDeBase> getMenus() {
        return menus;
    }

}
