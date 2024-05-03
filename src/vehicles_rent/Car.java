package vehicles_rent;

public class Car extends Vehicle {
    private  String make;
    private  String model;

    public Car(String vehicleID, double rentalRate, String make, String model) {
        super(vehicleID, rentalRate);
        this.make = make;
        this.model = model;
    }

    @Override
    public double calculateRentalCost(int hours) {
        return hours * getRentalRate();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmake\t=" + make  +
                "\nmodel\t=" + model
                ;
    }
}
