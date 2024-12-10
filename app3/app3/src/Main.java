public class Main {
    public static void main(String[] args) {
        IChemise chemiseService = new ChemiseImpl();
        IMontre montreService = new MontreImpl();

        
        Chemise chemise = chemiseService.saisie();
        chemiseService.affichage(chemise);

        
        Montre montre = montreService.saisie();
        montreService.affichage(montre);
    }
}
