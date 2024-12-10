public class Main {
    public static void main(String[] args) {
        IProduit produitService = new ProduitImpl();

        // Saisir un produit
        Produit produit = produitService.saisie();

        // Afficher le produit
        produitService.affichage(produit);
    }
}
