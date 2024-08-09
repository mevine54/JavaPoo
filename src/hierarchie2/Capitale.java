package hierarchie2;

public class Capitale extends Ville {
    String country;

    public Capitale(String country, int nbHab) {
        super(country, nbHab);
        this.country = country;
        this.nbHab = nbHab;
    }

    public Capitale(String name, String country, int nbHab) {
        super(name, nbHab);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void afficher() {
        System.out.println("Ville de : " + name + "a" + nbHab + "habitants" + "et la capitale est : " + name);
    }

    @Override
    public String toString() {
        return "Capitale [country=" + country + ", nbHab=" + nbHab + "]";
    }

}
