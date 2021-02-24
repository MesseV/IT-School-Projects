package InheritanceStudentAndProfessor;

public class Student extends Persoana {
    private int anCurent;

    public Student(String nume, String prenume, int varsta, int anCurent) {
        super(nume, prenume, varsta);
        this.anCurent = anCurent;
    }

    public void changeName (String newName) {
        super.setNume(newName);
    }

    public int getAnCurent() {
        return anCurent;
    }

    public void setAnCurent(int anCurent) {
        this.anCurent = anCurent;
    }
}
