package fr.pompey.dev.afpa.geometry;

public class testCercle {
    public static void main(String[] args) {
        // Créer un point pour le centre du cercle
        Point centre = new Point(1.0, 2.0);

        // Créer un cercle avec le centre et un rayon
        Cercle cercle = new Cercle(centre, 5.0);

        // Afficher les informations du cercle
        cercle.afficher();

        // Créer des points pour tester leur appartenance au cercle
        Point point1 = new Point(3.0, 4.0);
        Point point2 = new Point(10.0, 10.0);

        // Tester si les points appartiennent au cercle et afficher les résultats
        System.out.println("Point " + point1 + " appartient au cercle : " + cercle.appartientPoint(point1));
        System.out.println("Point " + point2 + " appartient au cercle : " + cercle.appartientPoint(point2));
    }
}
