package fr.pompey.dev.afpa.exo1;

public class TestCompte {
    // Méthode main
    public static void main(String[] args) {
        // Création d'un Compte avec solde initial de 1000
        Compte compte = new Compte(1000d);

        // Afficher le solde initial
        compte.afficher();

        // Déposer 500
        compte.deposer(500.0);

        // Retirer 200
        compte.retirer(200.0);

        // Afficher le solde final
        compte.afficher();

    }
}
