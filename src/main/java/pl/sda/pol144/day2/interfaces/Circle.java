package pl.sda.pol144.day2.interfaces;

import pl.sda.pol144.day2.abstractions.Shape;

public class Circle extends Shape {
    private final int radius;

    public Circle(String id, int radius) {
        super(id);
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle " + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
