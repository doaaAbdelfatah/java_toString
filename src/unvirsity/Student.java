package unvirsity;

public class Student extends  Person {

    private  int studentID;

    public Student(int studentID) {
        this.studentID = studentID;
    }

    public Student(String name, String email, int age, int studentID) {
        super(name, email, age);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return super.toString() +
                "studentID=" + studentID ;
    }
}
