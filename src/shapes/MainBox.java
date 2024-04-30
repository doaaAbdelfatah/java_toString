package shapes;

public class MainBox {
    public static void main(String[] args) {
        Box b1 = new Box(10,5,7);
        Box b2 = new Box(10,5,7);
        Box b3 = new Box(11,5,7);
        System.out.println(b1.equals(b2)); // true
        System.out.println(b1.equals(b3)); //false
    }
}
