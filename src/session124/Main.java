package session124;

public class Main {
    public static void main(String[] args) {
        Student [] students = new Student[5];

        students[0] = new Student("Dana" , "Female");
        students[0].setAdddress("Alexandria, Egypt");
        students[0].setMobile("01225738514");

        students[1] = new Student("Ahmed" , "Male" ,"Alex" , "012587999");
        students[2] = new Student("Ali" , "Male" ,"0150895959");
        students[3] = new Student("Dalia" , "Female");
        students[4] = new SeniorStudent("Sara" , "Female" , "Egypt" , "0405484959");

        SchoolClass c = new SchoolClass("Anee" , students);



    }
}
