public class Runner {

    public static void main(String[] args) {
        School BHS = new School("Berkeley High");

        Section math = new Section("math");
        Section biology = new Section("bio");
        Section computerScience = new Section("compSci");

        Teacher Albinson = new Teacher("Albinson", "compSci");
        Teacher Nathan = new Teacher("Nathan", "math");
        Teacher Bearg = new Teacher("Bearg", "bio");

        math.setTeacher(Nathan);
        biology.setTeacher(Bearg);
        computerScience.setTeacher(Albinson);

        Nathan.addSection(math);
        Albinson.addSection(computerScience);
        Bearg.addSection(biology);

        Student Matthew = new Student("Matthew", 11);
        Student Mateo = new Student("Mateo", 11);
        Student Keenan = new Student("Keenan", 11);
        Student Lassie = new Student("Lassie", 11);
        Student Tenzin = new Student("Tenzin", 11);
        Student Finn = new Student("Finn", 11);

        BHS.addSection(computerScience);
        BHS.addSection(biology);
        BHS.addSection(math);

        math.addStudents(Matthew);
        math.addStudents(Mateo);
        math.addStudents(Keenan);
        math.addStudents(Lassie);
        math.addStudents(Tenzin);
        math.addStudents(Finn);

        biology.addStudents(Matthew);
        biology.addStudents(Mateo);
        biology.addStudents(Keenan);
        biology.addStudents(Lassie);
        biology.addStudents(Tenzin);
        biology.addStudents(Finn);

        computerScience.addStudents(Matthew);
        computerScience.addStudents(Mateo);
        computerScience.addStudents(Keenan);
        computerScience.addStudents(Lassie);
        computerScience.addStudents(Tenzin);
        computerScience.addStudents(Finn);

        Matthew.addSection(math);
        Mateo.addSection(math);
        Keenan.addSection(math);
        Lassie.addSection(math);
        Tenzin.addSection(math);
        Finn.addSection(math);

        Matthew.addSection(biology);
        Mateo.addSection(biology);
        Keenan.addSection(biology);
        Lassie.addSection(biology);
        Tenzin.addSection(biology);
        Finn.addSection(biology);

        Matthew.addSection(computerScience);
        Mateo.addSection(computerScience);
        Keenan.addSection(computerScience);
        Lassie.addSection(computerScience);
        Tenzin.addSection(computerScience);
        Finn.addSection(computerScience);



        System.out.println(BHS.toString1());
        System.out.println(computerScience.toString2());
        System.out.println(math.toString2());
        System.out.println(biology.toString2());
        System.out.println(Albinson.toString3());
        System.out.println(Nathan.toString3());
        System.out.println(Bearg.toString3());
        System.out.println(Matthew.toString4());
        System.out.println(Mateo.toString4());
        System.out.println(Keenan.toString4());
        System.out.println(Lassie.toString4());
        System.out.println(Tenzin.toString4());
        System.out.println(Finn.toString4());







    }

}
