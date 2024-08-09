package fr.pompey.dev.afpa.hierarchie;

public class Staff extends Person {
    private String school;
    private double pay;

    // Constructeur enfant Staff
    public Staff(String name, String adress, String school, double pay ) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    // Surcharge de la méthode toString
    @Override
    public String toString() {
        return "Staff [school=" + school + ", pay=" + pay + "]";
    }
}
