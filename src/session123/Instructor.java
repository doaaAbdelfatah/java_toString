package session123;

public class Instructor extends Person implements Employee {

    private  double hours;
    private  double hourRate;

    public Instructor(String name, String gender, double hours, double hourRate) {
        super(name, gender);
        this.hours = hours;
        this.hourRate = hourRate;
    }

    @Override
    public double totalSalary() {
        return hours * hourRate;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nhours=" + hours +
                "\nhourRate=" + hourRate;
    }
}
