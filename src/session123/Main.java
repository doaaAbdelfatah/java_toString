package session123;

public class Main {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        printData(c1); //
//
        Class2 c2 = new Class2();
        printData(c2); //



    }

    static  void printData(One obj){
        if (obj instanceof Class1){
            Class1 c = (Class1) obj; // int i = (int) d;
            System.out.println(  c.two());
        }
        System.out.println( obj.one("Ahmed"));
    }

    static  void test (int x){
        System.out.println("int : " +x);
    }

    static  void test (String x){
        System.out.println("String : " + x);
    }

    static  void test (Object x){
        System.out.println("Object : " + x);

        if (x instanceof  Class1){
            Class1 c = (Class1) x;
            System.out.println( c.one("test"));
            System.out.println( c.two());
        }

    }
}
