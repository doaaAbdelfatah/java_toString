package vehicles_rent;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("12335" , 100 , "BMW" ,"XC1222");
        System.out.println(c);
        System.out.println(c.calculateRentalCost(5));

        Bicycle b = new Bicycle("78797" , 10 , 4);
        System.out.println(b);
        System.out.println(b.calculateRentalCost(5));
    }
}
