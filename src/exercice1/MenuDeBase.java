package exercice1;

import exercice1.exception.PlatException;
import exercice1.utilitaire.CarteUtilitaire;

public class MenuDeBase {
    //Attributs
    private String nom;
    private Plat entree;
    private Plat platPrincipal;

    //Constructeur
    /**
     * Création d'un menu de base
     * @param nom nom du menu
     * @param entree plat d'entrée du menu
     * @param platPrincipal plat principal du menu
     */
    public MenuDeBase(String nom, Plat entree, Plat platPrincipal){
        this.nom = nom;
        this.entree = entree;
        this.platPrincipal = platPrincipal;
    }

    //Méthodes
    public String getNom() {
        return nom;
    }

    public Plat getEntree() {
        return entree;
    }

    public Plat getPlatPrincipal() {
        return platPrincipal;
    }

    protected double getPrixDeVenteAvantRemise(){
        return getEntree().getPrixDeVente() + getPlatPrincipal().getPrixDeVente();
    }

    /**
     * Calculer le prix de vente du menu
     * @return un double arrondi correspondant à la formule (prixEntree + PrixPlatPrincipal)*0.8
     */
    public double getPrixDeVente(){
        return CarteUtilitaire.arrondi(getPrixDeVenteAvantRemise()*0.8);
    }

    public String getDescription(){
    return "Menu : " + getNom() + " - " + getPrixDeVente() + " euros\n\t Entrée : "  + getEntree().getNom() + "\n\t Plat Principal : " + getPlatPrincipal().getNom() + "\n";
    }



}
