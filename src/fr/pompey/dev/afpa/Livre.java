package fr.pompey.dev.afpa;

public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;

    // Constructeur
    public Livre (String unAuteur, String unTitre, int unNbPages) {
        this.auteur = unAuteur;
        this.titre = unTitre;
        this.nbPages = unNbPages;

    }
    // Getter & Setter
    public String getAuteur() {
        return auteur;
    }

    public void String setAuteur(String unAuteur) {
        this.auteur = unAuteur;
    }
}
