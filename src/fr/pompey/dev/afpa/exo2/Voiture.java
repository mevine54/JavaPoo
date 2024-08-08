package fr.pompey.dev.afpa.exo2;

public class Voiture {
    // Attributs
    private String brand;
    private Double price;

    // Constructeur
    public Voiture() {
        }
    // Méthode
    public void afficher() {
        if (brand == null) {
            System.out.println("La voiture n'a pas de marque");
        } else  {
            System.out.println("La voiture est une " + brand);
        }

        if (price == null) {
            System.out.println("La voiture n'a pas de prix");
        } else {
            System.out.println("La voiture à un prix de " + price);
        }

    }

    // Getters et Setters
    public String getBrand() {
        return brand;
        }

    public void setBrand() {
        this.brand = brand;
        }

    public Double getPrice() {
        return price;
        }

    public void setPrice(Double price) {
        this.price = price;
        }
}

