package exceptions.DivideBy0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner reader = new Scanner(System.in);

        while (true)
        {
        try { //partea urmatoare se executa daca nu avem exceptie
            System.out.println("Introduceti primul numar.");
            int x= reader.nextInt();
            reader.nextLine();
            System.out.println("Introduceti al doilea numar.");
            int y = reader.nextInt();
            reader.nextLine();
            int rezultat = x/y;
            int rezultat2 = calculator.impartire(x,y);
            System.out.println(rezultat);
            System.out.println(rezultat2);
        } catch (MyCustomException ex) { //partea urmatoare se executa daca exista exceptie MyCustomException
            System.out.println("Can't divide by 0.");
        }catch (ArithmeticException ex2) {
            System.out.println("Can't divide by 0, my dude.");
        } finally { //orice s-ar intampla, urmatorul cod se va executa
            System.out.println("---------");
        }
        }
    }



}
