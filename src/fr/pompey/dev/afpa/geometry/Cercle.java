package fr.pompey.dev.afpa.geometry;


public class Cercle {
    // Attributs
    private Point centre;
    private double radius;


    // Constructeur
    public Cercle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    // Méthodes
    public double perimetre() {
        return (Math.PI * (radius * 2));
    }

    public double surface() {
        return Math.PI * (radius * radius);
    }

    // Getter & Setter
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Méthode pour tester l'appartenance d'un point au cercle
    public boolean appartientPoint(Point p) {
        double dabscisse = p.getAbscisse() - centre.getAbscisse();
        double dordonnee = p.getOrdonnee() - centre.getOrdonnee();
        double distanceCarre = dabscisse * dabscisse + dordonnee * dordonnee;
        double rayonCarre = radius * radius;
        return distanceCarre <= rayonCarre;
    }

    public void afficher() {
        System.out.println("Cercle de centre " + centre + " et de rayon " + radius);
        System.out.println("Périmètre : " + perimetre());
        System.out.println("Surface : " + surface());
    }
}
