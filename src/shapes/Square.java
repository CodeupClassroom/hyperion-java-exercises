package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(length);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
