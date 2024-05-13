package session125;

public class Engine {
    private  double hoursPW;
    private  double maxSpeed;
    private String dieselFuel;

    public Engine() {
        this.dieselFuel = "Gaz";
        this.hoursPW = 1000;
        this.maxSpeed = 250;
    }

    public Engine(double hoursPW, double maxSpeed) {
        this.hoursPW = hoursPW;
        this.maxSpeed = maxSpeed;
        this.dieselFuel = "Gaz";
    }

    public Engine(double hoursPW, String dieselFuel) {
        this.hoursPW = hoursPW;
        this.dieselFuel = dieselFuel;
        this.maxSpeed = 250;
    }

    public Engine( String dieselFuel ,double maxSpeed) {
        this.hoursPW = 1000;
        this.dieselFuel = dieselFuel;
        this.maxSpeed = maxSpeed;
    }

    public Engine(double hoursPW, double maxSpeed, String dieselFuel) {
        this.hoursPW = hoursPW;
        this.maxSpeed = maxSpeed;
        this.dieselFuel = dieselFuel;
    }

    public double getHoursPW() {
        return hoursPW;
    }

    public void setHoursPW(double hoursPW) {
        this.hoursPW = hoursPW;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getDieselFuel() {
        return dieselFuel;
    }

    public void setDieselFuel(String dieselFuel) {
        this.dieselFuel = dieselFuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "hoursPW=" + hoursPW +
                ", maxSpeed=" + maxSpeed +
                ", dieselFuel='" + dieselFuel + '\'' +
                '}';
    }
}
