package InheritanceStudentAndProfessor;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Mesesan", "Vlad", 27, 3);

        Professor profesor = new Professor("Popescu", "Ion", 39, "Engleza");
        //se poate scrie si "Persoana professor = new Professor(...);"
        Persoana persoana = new Persoana("Alex", "Tudor", 23);

        afisarePersoana(profesor);
        afisarePersoana(student);

        Student[] groupOfStudents = new Student[5];
        groupOfStudents[0] = student;

        //polymorphism - cand primi alte forme ale aceluiasi obiect - primeste o alta forma a clasei persoana
        Persoana[] groupOfPeople = new Persoana[5];
        groupOfPeople[0] = student;
        groupOfPeople[1] = profesor;
        groupOfPeople[2] = persoana;

        for(int i = 0; i < groupOfPeople.length; i++) {
                Persoana per = groupOfPeople[i];
            if (per != null) {
                afisarePersoana(per);
            }
        }
    }
    public static void afisarePersoana(Persoana persoana) {
        System.out.println(persoana.getNume() + " " + persoana.getPrenume() + " " + persoana.getVarsta());
    }
}
