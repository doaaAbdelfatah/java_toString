package unvirsity;

import java.util.Arrays;

public class Course {
    private int courseCode;
    private String courseName;
    private Professor professor;
    private  Student [] studentsEnrolled;

    public Course() {
        studentsEnrolled = new Student[10];
    }

    public Course(int courseCode, String courseName) {
        this(); //Course()
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public Course(int courseCode, String courseName, Professor professor) {
        this(courseCode,courseName); // Course(int courseCode, String courseName)
        this.professor = professor;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(Student[] studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public  void addStudent (Student student){
        for (int i = 0; i < studentsEnrolled.length ; i++) {
            if (studentsEnrolled[i] == null ){
                studentsEnrolled[i]  = student;
                break;
            }
        }
    }
    public  void removeStudent (int studentID){
        for (int i = 0; i < studentsEnrolled.length ; i++) {
            if (studentsEnrolled[i].getStudentID() == studentID ){
                studentsEnrolled[i]  = null;
                break;
            }
        }
    }


    @Override
    public String toString() {
        return
                "courseCode=" + courseCode +
                ", courseName='" + courseName  +
                ", professor=" + professor +
                ", studentsEnrolled=" + Arrays.toString(studentsEnrolled);
    }
}
