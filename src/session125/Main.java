package session125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Engine e2 = new Engine();
        e2.setMaxSpeed(800);
        System.out.println(e2); // 250

        Engine e = new Engine(1500,500,"xxx");
        System.out.println(e);

        Engine e3 = new Engine();
        System.out.println(e3);

        Engine e4 = new Engine(1200,"Electrical");
        System.out.println(e4);

        Car c = new Car("5001" , "BMW" ,e4 );
        System.out.println(c);

        Driver d = new Driver("Ahmed" , "male" , "Good" , "12354");

        Car c2 = new Car("1001" , "Audi" , e , d);
        System.out.println(c2);
    }
}
