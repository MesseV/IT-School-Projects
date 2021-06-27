package com.company;

import com.company.Objects.Circle;
import com.company.Objects.Rectangle;
import com.company.Objects.Shape;
import com.company.Objects.Square;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        Circle circle = new Circle(5, "blue", true);
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(3.0);
        System.out.println(square.getSide());
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
    }
}
