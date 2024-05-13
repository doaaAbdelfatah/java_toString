package files;

public class ArrayDemo {
    public static void main(String[] args) {
        String [] names ={"Doaa" ,"Mohamed" , "Mai" ,"Safaa" , "walaa" }; // length = 5
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        System.out.println("-------------");
        for (String n : names){
            System.out.println(n);
        }

        System.out.println("=======================");

        double [] degrees = new double[5];
        degrees[0] = 10;
        degrees[1] = 5;
        degrees[2] = 7;
        degrees[3] = 3;
        degrees[4] = 9;

        for (double d : degrees) System.out.println(d);
    }
}
