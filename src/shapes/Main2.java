package shapes;

public class Main2 {

    public static void main(String[] args) {
        String name = "ahmed";
        String name2 = new String("ahmed");
        String name3 ="ahmed";
        System.out.println(name == name2 ); //false  compare memory address
        System.out.println(name == name3 ); //true  compare memory address (same address in String pool)
        System.out.println(name.equals(name2)); // true compare string object
        System.out.println(name.equals(name3)); // true compare string object
    }
}
