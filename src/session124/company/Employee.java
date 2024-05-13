package session124.company;

public abstract class Employee implements HasSalary
{
    private String name;
    private String job;
    private double basicSalary;

    public Employee(String name, String job, double basicSalary) {
        this.name = name;
        this.job = job;
        this.basicSalary = basicSalary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }


}
