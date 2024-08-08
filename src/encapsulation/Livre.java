package encapsulation;

public class Livre {
    // Variables
    private String titre;
    private String auteur;
    private int nbPages;


    // Constructeur
    public Livre (String unAuteur, String unTitre, int unNbPages) {
        this.auteur = unAuteur;
        this.titre = unTitre;
        this.nbPages = unNbPages;

    }

    public Livre (String unAuteur, String unTitre) {
        this.auteur = unAuteur;
        this.titre = unTitre;
    }

    public Livre () {

    }

    // Méthode
    public String afficheToi() {
        return this.titre + " " + this.auteur + " " + this.nbPages;
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
            System.out.println("Erreur le nombre de pages doit être positif");
        }
    }

}
