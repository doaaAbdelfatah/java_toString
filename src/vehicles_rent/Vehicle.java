package vehicles_rent;

public abstract class Vehicle {
    private  String vehicleID;
    private  double rentalRate;

    public Vehicle(String vehicleID, double rentalRate) {
        this.vehicleID = vehicleID;
        this.rentalRate = rentalRate;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    public abstract  double calculateRentalCost(int hours);

    @Override
    public String toString() {
        return
                "vehicleID\t=" + vehicleID  +
                "\nrentalRate\t=" + rentalRate;
    }
}
