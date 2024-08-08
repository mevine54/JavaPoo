package fr.pompey.dev.afpa.geometry;

public class Point {
    // Attributs
    private double abscisse;
    private double ordonnee;

    // Constructeur pour initialiser les coordonnées du point
    public Point(double abscisse, double ordonnee){
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    // Getter & Setter
    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee){
        this.ordonnee = ordonnee;
    }
}


