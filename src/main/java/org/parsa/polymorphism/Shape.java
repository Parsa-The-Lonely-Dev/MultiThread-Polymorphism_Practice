package org.parsa.polymorphism;

public class Shape {
    private boolean filled;
    private String color;

    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }


    public Shape() {
        this.filled = true;
        this.color = "green";
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
