package demo;

public class Box extends Rect implements  ThreeD {
    private double height;

    public Box(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double volume() {
        return height * getLength() * getWidth();
    }
}
