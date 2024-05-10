package session123;

public class MainE {
    public static void main(String[] args) {
       Instructor i = new Instructor("Doaa" ,"Female" ,40 ,50) ;
       printSalary(i);
       System.out.println("---------------");
       Manager m = new Manager("Ahmed" , "Male" , "HR");
       printSalary(m);

       Student s = new Student();
        print(i);
        print(m);
        print(s);
    }


    static void printSalary(Employee e){
        if (e instanceof  Instructor){
            System.out.println("He is Instructor");
        } else if (e instanceof  Manager) {
            System.out.println("He is Manager");
        }
        System.out.println(e.totalSalary());
        System.out.println(e);
    }

    static  void print(Person p ){
        System.out.println(p);
    }
}
