package shapes;

public class Rect { // extends Object
    double width;
    double length;

    public Rect() {
    }

    public Rect(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String toString() { //override toString => class Object
//        return "I am Rect my width = " + this.width + " and My length = " + this.length;
//        return "Rect{width = " + this.width + " ,length = " + this.length + "}";
        return "width \t:" + this.width + "\nlength \t:" + this.length ;
    }

    public boolean equals(Object anObject)
    {
        Rect r = (Rect) anObject; // casting
        if (this.width == r.width && this.length == r.length) return  true;
        else  return  false;
    }
}
