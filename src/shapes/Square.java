package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int getPerimeter() {
        return 4 * this.length;
    }

    public int getArea() {
        return (int)Math.pow(this.length, 2);
    }

    public int superGetPerimeter() {
        return super.getPerimeter();
    }

    public int superGetArea() {
        return super.getArea();
    }
}
