package session125;

public class Car  {
    private String model;
    private String brand;
    private int seatsNumber;
    private int doorsNumber;

    private  Engine engine; //  Composition

    private Driver driver; // Aggregation

    public Car(String model, String brand, Engine engine) {
        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.seatsNumber =5;
        this.doorsNumber=4;
    }

    public Car(String model, String brand, Engine engine, Driver driver) {
        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.driver = driver;
        this.seatsNumber =5;
        this.doorsNumber=4;
    }

    public Car(String model, String brand, int seatsNumber, int doorsNumber, Engine engine) {
        this.model = model;
        this.brand = brand;
        this.seatsNumber = seatsNumber;
        this.doorsNumber = doorsNumber;
        this.engine = engine;
    }

    public Car(String model, String brand, int seatsNumber, int doorsNumber, Engine engine, Driver driver) {
        this.model = model;
        this.brand = brand;
        this.seatsNumber = seatsNumber;
        this.doorsNumber = doorsNumber;
        this.engine = engine;
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", doorsNumber=" + doorsNumber +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
