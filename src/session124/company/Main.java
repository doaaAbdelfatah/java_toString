package session124.company;

public class Main {
    public static void main(String[] args) {
        Company c =new Company("Mystro") ;

        Employee [] employees = new Employee[3];
        employees[0] = new Coche("Ahmed" , 70,50);
        employees[1] = new Sales("Dina" , 4000);
        employees[2] = new Sales("Sara" , 6000);

        c.setEmployees(employees);

        c.allSalries();


    }
}
