package fr.pompey.dev.afpa.encapsulation;

public class Livre {
    // Variables
    private String titre;
    private String auteur;
    private int nbPages;
    private double prix;


    // Constructeur
    public Livre (String unAuteur, String unTitre, int unNbPages, double unPrix) {
        this.auteur = unAuteur;
        this.titre = unTitre;
        this.nbPages = unNbPages;
        this.prix = unPrix;

    }
    boolean prixFixe;

//    public Livre (double unPrix) {
//        this.prix = unPrix;
//    }

    public Livre (String unAuteur, String unTitre) {
        this.auteur = unAuteur;
        this.titre = unTitre;
    }

    public Livre () {

    }

    // Méthode
    public String afficheToi() {
        return "L'auteur " + this.getAuteur() + " a écrit le livre"
                + this.getTitre() + " ayant "
                + this.getNbPages() + " pages."
                + System.lineSeparator()
                + "son prix est de : " + this.getPrix();
    }

    // Getter & Setter
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String unAuteur) {
        this.auteur = unAuteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String unTitre) {
        this.titre = unTitre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int unNbPages) {
        if (unNbPages > 0) {
            this.nbPages = unNbPages;
        } else {
            System.err.println("Erreur le nombre de pages doit être positif");
        }
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double unPrix) {
        if (prixFixe) {
            System.err.println("le prix est déjà fixé");
        } else if (prix > 0.0) {
            this.prix = prix;
            this.prixFixe = true;
        } else {
            System.err.println("erreur : le prix ne peut être négatif ou nul");
        }

    }



}
