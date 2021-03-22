package exceptions.DivideBy0;

public class Calculator {

    public int impartire(int x, int y) throws MyCustomException {
        int rezultat = 0;
        if (y == 0) {
            MyCustomException exception = new MyCustomException("Custom Exception");
            throw exception;
        } else {
            rezultat = x / y;
        }
        return rezultat;
    }
}
