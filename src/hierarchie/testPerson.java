package hierarchie;

public class testPerson {
    public static void main(String[] args) {
        // Création de l'objet Person
        Person aPerson = new Person("Mévine", "12 rue des champs");
        System.out.println(aPerson);
//        System.out.println(aPerson.getName());
//        System.out.println(aPerson.getAdress());


        // Création de l'objet Student
        Student aStudent = new Student("Kévin", "13 rue des champs", "Computing", 2023, 16000);
        System.out.println(aStudent);
//        System.out.println(aStudent.getName());
//        System.out.println(aStudent.getAdress());
//        System.out.println(aStudent.getProgram());
//        System.out.println(aStudent.getYear());
//        System.out.println(aStudent.getFee());


        // Création de l'objet Staff
        Staff aStaff = new Staff("Alvin", "14 rue des champs", "AFPA", 3000);
        System.out.println(aStaff);
//        System.out.println(aStaff.getName());
//        System.out.println(aStaff.getAdress());
//        System.out.println(aStaff.getSchool());
//        System.out.println(aStaff.getPay());
    }
}