package fr.pompey.dev.afpa.hierarchie;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    // Constructeur de l'enfant Student avec appel du constructeur de la mère
    public Student(String name, String adress, String program, int year, double fee) {
        super(name, adress);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


    // Surcharge de la méthode toString
    @Override
    public String toString() {
        return "Student [program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}
