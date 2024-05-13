package session124.company;

public class Coche extends Employee {

    private  double hours;
    private  double hourRate;

    public double getHours() {
        return hours;
    }

    public Coche(String name, double hours ,double hourRate) {
        super(name);
        this.hours = hours;
        this.hourRate = hourRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    @Override
    public double totalSalary() {
        return getBasicSalary() + hours * hourRate;
    }
}
