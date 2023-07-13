package pl.sda.pol144.day2;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] picture = new Shape[5];
        picture[0] = new Rectangle("r1", 20, 30);
        picture[1] = new Rectangle("r2", 10, 30);
        //picture[2] = new Shape("c1", 15);
        drawPicture(picture);
    }

    public static void drawPicture(Shape[] picture){
        for(Shape shape: picture){
            if(shape != null){
                shape.draw();
            }
        }
    }
}
