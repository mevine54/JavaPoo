package fr.pompey.dev.afpa.encapsulation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Méthode pour créer deux livres
//        Livre livre1 = new Livre("Nadine Garel ", "Au pays du grand condor ", 150);
//        Livre livre2 = new Livre("Ernest Hemingway ", "Le vieil homme et la mer ", 200);

        // Méthode pour créer 3 livres de 300 pages
        Livre livre3 = new Livre();
        Livre livre4 = new Livre("Joseph Kessel", "Le lion");
        Livre livre5 = new Livre("Paulo Coelho", "L'alchimiste", 300, 25.15);

        livre3.setNbPages(300);
        livre4.setNbPages(300);

        // Afficher les infos de ces 3 livres
        System.out.println("livre3: ");
        System.out.println("livre4: " + livre4.getAuteur() + " " + livre4.getTitre());
        System.out.println("livre5: " + livre5.getAuteur() + " " + livre5.getTitre() + " " + livre5.getNbPages() + " " + livre5.getPrix());

        // Modification nombre de pages livre1
//        livre1.setNbPages(130);
//        livre2.setNbPages(170);

        // Affichage infos livre1 après modification
//        System.out.println("Livre 1 après modification : " + livre1.getTitre() + " de " + livre1.getAuteur() + ", " + livre1.getNbPages() + " pages");
//        System.out.println("Livre 2 après modification : " + livre2.getTitre() + " de " + livre2.getAuteur() + ", " + livre2.getNbPages() + " pages");

        // Affichage livres de 300 pages
//        System.out.println("Livre 3 après modification : ");
//        System.out.println("Livre 4 après modification : " + livre4.getTitre() + " de " + livre4.getAuteur());
//        System.out.println("Livre 5 après modification : " + livre5.getTitre() + " de " + livre5.getAuteur() + ", " + livre5.getNbPages() + " pages");

        // Le nombre total de pages
//        System.out.println("Total des pages des deux livres : " + (livre1.getNbPages() +  livre2.getNbPages()) + " pages");


    }
}