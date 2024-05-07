package session122;

public class Main {
    public static void main(String[] args) {
        Test t = null;
        t = new Test();
        System.out.println(t);

        Test t2 = new Test();
        System.out.println(t2);

        Test t3 = t;
        System.out.println(t3);
    }
}
