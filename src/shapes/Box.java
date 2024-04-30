package shapes;

public class Box extends Rect {
    double height;

    public Box() {
    }

    public Box(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public String toString() { //override toString => class Object
         return super.toString() + "\nheight \t:" + this.height ;
    }

    @Override
    public boolean equals(Object anObject) {
        Box b = (Box) anObject;
//        return  (b.length == this.length && b.width == this.width && this.height == b.height);
        return  (super.equals(anObject) && this.height == b.height);
    }
}
