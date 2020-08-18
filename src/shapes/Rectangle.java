package shapes;

public class Rectangle {  // this
    protected int length; // this.length
    protected int width;  // this.width

    public Rectangle(int inputLength, int width) {
        length = inputLength;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2*length + 2*width;
    }

}
