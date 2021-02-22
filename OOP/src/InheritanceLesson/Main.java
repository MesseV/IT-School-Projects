package InheritanceLesson;

public class Main {
    public static void main(String[] args) {
        Felina felina = new Felina();
        felina.setName("Shadow");
        System.out.println(felina.getName());

        Urs urs = new Urs();
        urs.setName("Grizzly");
        System.out.println(urs.getName());
    }
}
