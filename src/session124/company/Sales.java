package session124.company;

public class Sales extends Employee {

    private  double commission ;

    public double getCommission() {
        return commission;
    }

    public Sales(String name, double commission) {
        super(name);
        this.commission = commission;
    }

    public Sales(String name, String job, double basicSalary, double commission) {
        super(name, job, basicSalary);
        this.commission = commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double totalSalary() {
        return getBasicSalary() + commission;
    }
}
