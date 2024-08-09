package hierarchie2;

public class Ville {
    String name;
    int nbHab;

    // Constructeur
    public Ville(String name) {
        int nbHab = -1;
        this.name = name;
    }

    public Ville(String name, int nbHab) {
        if (nbHab < 0) {
            System.out.println("Le nombre d'habitant doit être positif");
        } else {
            nbHab = nbHab;
        }
        this.name = name;
        this.nbHab = nbHab;

    }

    public String getName () {
        return name;
    }

    public int getNbHab () {
        if (nbHab < 0) {
            System.out.println("Un nombre d'habitants doit être positif. La modification n'a pas été prise en compte");
        }
        return nbHab;
    }

    @Override
    public String toString() {
        return "Ville{" + "name=" + name + ", nbHab=" + nbHab + '}';
    }
}
