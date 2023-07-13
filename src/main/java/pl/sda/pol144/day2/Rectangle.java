package pl.sda.pol144.day2;

public class Rectangle extends Shape{
    private int width;

    private int height;

    public Rectangle(String id, int width, int height) {
        super(id);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: " + getId() + ", " + ", width: " + width +", height: " + height );
    }

    @Override
    public double area() {
        return 0;
    }
}
