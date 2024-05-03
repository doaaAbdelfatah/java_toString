package vehicles_rent;

public class Bicycle extends Vehicle {

    private  int gearCount;

    public Bicycle(String vehicleID, double rentalRate, int gearCount) {
        super(vehicleID, rentalRate);
        this.gearCount = gearCount;
    }

    @Override
    public double calculateRentalCost(int hours) {
        return getRentalRate() * hours * 0.7; // Discount = 30%  0.3 (1-0.3 =0.7)
        // return getRentalRate() * hours * (1-0.30) ; // Discount = 30%  0.3 (1-0.3 =0.7)
        // return (getRentalRate() * hours -  getRentalRate() * hours *0.3)   ; // Discount = 30%  0.3
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ngearCount\t=" + gearCount
                ;
    }
}
