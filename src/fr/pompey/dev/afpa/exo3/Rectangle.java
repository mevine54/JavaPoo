package fr.pompey.dev.afpa.exo3;


public class Rectangle {
    // Attributs
    public double longueur;
    public double largeur;

    // Constructeur
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }



    // Méthodes
    public double surface() {
        return this.longueur * this.largeur;
    }

    public double perimetre() {
        return (this.longueur + this.largeur) * 2;
    }

    public void afficher() {
        System.out.println("La surface du rectangle est de: " + surface());
        System.out.println("Le périmètre du rectangle est de: " + perimetre());
    }
}
