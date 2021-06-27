package com.company.Objects;

public class Rectangle extends Shape{
    protected static double width;
    protected static double length;

    public Rectangle () {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle (double width, double length) {
        Rectangle.length = length;
        Rectangle.width = width;
    }

    public  Rectangle (double width, double length, String colour, boolean filled) {
        super(colour, filled);
        Rectangle.width = width;
        Rectangle.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        Rectangle.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        Rectangle.length = length;
    }

    public double getArea () {
        return width * length;
    }

    public double getPerimeter () {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "A rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
}
