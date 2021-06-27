package com.company.Objects;

public class Square extends Rectangle{

    public Square () {}

    public Square (double side) {
        width = side;
    }

    public Square (double side, String colour, boolean filled) {
        super(width, length, colour, filled);
        width = side;
    }

    public double getSide () {
        return width;
    }

    public void setSide (double side) {
        side = width;
    }

    @Override
    public String toString() {
        return "Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }
    //need to override because both getArea and getPerimeter because mathematical formulas are different for squares
}
