package pl.sda.pol144.day2.abstractions;

public abstract class Shape {
    private final String id;
    public abstract void draw();
    public abstract double area();

    public Shape(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
