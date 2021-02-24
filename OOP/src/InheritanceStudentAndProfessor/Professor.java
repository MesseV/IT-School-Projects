package InheritanceStudentAndProfessor;

public class Professor extends Persoana{

    private String specializare;

    public Professor(String nume, String prenume, int varsta, String specializare) {
        super(nume, prenume, varsta);
        this.specializare = specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public String getSpecializare() {
        return specializare;
    }
}
