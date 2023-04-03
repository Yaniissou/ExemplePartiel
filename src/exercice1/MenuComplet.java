package exercice1;

public class MenuComplet extends MenuDeBase {

    private Plat dessert;

    public MenuComplet(String nom, Plat entree, Plat platPrincipal, Plat dessert) {
        super(nom, entree, platPrincipal);
        this.dessert = dessert;
    }

    public Plat getDessert() {
        return dessert;
    }

    protected double getPrixDeVenteAvantRemise() {
        return getEntree().getPrixDeVente() + getPlatPrincipal().getPrixDeVente() + getDessert().getPrixDeVente();
    }

    @Override
    public String getDescription() {
        return "Menu : " + getNom() + " - " + getPrixDeVente() + " euros\n" +
                "\t Entrée : "  + getEntree().getNom() + "\n" +
                "\t Plat Principal : " + getPlatPrincipal().getNom() + "\n" +
                "\t Dessert : " + getDessert().getNom() ;
    }


}
