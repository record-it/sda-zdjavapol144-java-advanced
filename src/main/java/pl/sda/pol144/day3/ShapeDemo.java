package pl.sda.pol144.day3;

import pl.sda.pol144.day2.abstractions.Shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape triangle = new Shape("t1") {
            @Override
            public void draw() {
                System.out.println("Triangle");
            }

            @Override
            public double area() {
                return 0;
            }
        };
    }
}
