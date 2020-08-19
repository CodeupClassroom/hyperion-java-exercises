package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Quadrilateral myShape;
        myShape = new Rectangle(7,11);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        System.out.println(myShape.getWidth());


    }
}
