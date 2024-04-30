package shapes;

public class MainRect {
    public static void main(String[] args) {
        Rect r1 = new Rect(10,20);
        Rect r2 = new Rect(10,20);

        Rect r3 = r1;

        System.out.println(r1 == r2); // false
        System.out.println(r1 == r3); // true

        System.out.println(r1.equals(r2)); // true
    }
}
