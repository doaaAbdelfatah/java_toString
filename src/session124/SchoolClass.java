package session124;

public class SchoolClass {
    private  String name;

    Student [] students ;

    public SchoolClass(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public SchoolClass() {
    }

    public SchoolClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
