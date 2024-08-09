package fr.pompey.dev.afpa.hierarchie;

public class Person {
    private String name;
    private String adress;

    // Constructeur de la mère
    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

//    public void afficher() {
//        System.out.println(name + " " + adress);
//    }


    // Surcharge de la méthode toString
    @Override
    public String toString() {
        return "Person [name=" + name + ", adress=" + adress + "]";
    }

}




