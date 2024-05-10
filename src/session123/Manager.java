package session123;

public class Manager extends Person implements Employee {
    private String departmentName;

    public Manager(String name, String gender, String departmentName) {
        super(name, gender);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public double totalSalary() {
        return 15000;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\ndepartmentName=" + departmentName ;
    }
}
