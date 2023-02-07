package org.parsa.polymorphism;

public class Square extends Rectangle{
    public Square(boolean filled, String color, double widthAndLength) {
        super(filled, color, widthAndLength, widthAndLength);
    }

    public Square(double widthAndLength) {
        super(widthAndLength,widthAndLength);
    }

    public Square() {
    }

    @Override
    public String toString() {
        return "A Square with the width & length=" + super.getWidth() + ", witch is a subclass of " + super.toString();
    }
}
