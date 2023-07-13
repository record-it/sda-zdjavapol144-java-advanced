package pl.sda.pol144.day2;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] picture = new Shape[5];


    }

    public static void drawPicture(Shape[] picture){
        for(Shape shape: picture){
            if(shape != null){
                shape.draw();
            }
        }
    }
}
