package session124.company;

public class Company {
    private  String name;
    private  Employee [] employees;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    void allSalries(){
        for (Employee e :employees){
            System.out.println( e.getName() + " - " + e.totalSalary());

//            if (e instanceof Coche){
//                Coche c = (Coche) e;
//                System.out.println( c.totalSalary());
//            } else if (e instanceof Sales) {
//                Sales s = (Sales) e;
//                System.out.println(s.totalSalary());
//            }
        }
    }
}
