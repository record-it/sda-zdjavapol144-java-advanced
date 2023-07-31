package pl.sda.pol144.day3;

public class LocalClassDemo {
    public static void main(String[] args) {
        // Przykład klasy lokalnej
        class Point {
            double x;
            double y;

            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
        }
        Point[] points = new Point[5];
        points[0] = new Point(1, 2);
        points[1] = new Point(1, 2);
        System.out.println(points[1].equals(points[0])); // false - brak implementacji metody equals!
        // Przykład rekordu lokalnego
        record Point2D(double x, double y){
            public double sum(){
                return x + y;           // przykład
            }
        };
        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D(1, 2);
        System.out.println(p1.equals(p2)); // record implementuje metodę equals
        System.out.println(p1.x());
        System.out.println(p1.sum());
    }

    public static void method() {
        // tu już nie można odwołać się do klasy Point lokalnej z main
    }
}
