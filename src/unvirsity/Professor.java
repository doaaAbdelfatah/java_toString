package unvirsity;

import java.util.Arrays;

public class Professor  extends Person{

    private Course [] courses ;

    public Professor(Course[] courses) {
        this.courses = courses;
    }

    public Professor(String name, String email, int age) {
        super(name, email, age);
    }

    public Professor(String name, String email, int age, Course[] courses) {
        super(name, email, age);
        this.courses = courses;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() +
                "courses=" + Arrays.toString(courses) ;
    }
}
