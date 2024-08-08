package fr.pompey.dev.afpa.exo1;

public class Compte {
    // Attributs
    public Double solde;

    // Constructeur
    public Compte(Double solde) {
        this.solde = 500.0;
    }

    // Méthodes
    public void deposer(Double montant) {
        solde += montant;
        System.out.println("Dépôt de " + montant + "effectué. Nouveau solde: " + solde);
    }

    public void retirer(Double montant) {
        if (solde >= montant) {
            solde -= montant;
            System.out.println("Retrait de " + montant + "effectué. Nouveau solde: " + solde);
        } else {
            System.out.println("Solde insuffisant.");
        }

    }

    public void afficher() {
        System.out.println("Solde actuel: " + solde);
    }
}
