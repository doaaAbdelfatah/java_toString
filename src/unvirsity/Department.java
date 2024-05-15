package unvirsity;

import java.util.Arrays;

public class Department {
    private String deptName;
    private  int deptCode;

    private  Professor headOfDepartment;

    private  Course [] coursesOffered;

    public Department() {
    }

    public Department(String deptName, int deptCode) {
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public Department(String deptName, int deptCode, Professor headOfDepartment) {
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.headOfDepartment = headOfDepartment;
    }

    public Department(String deptName, int deptCode, Professor headOfDepartment, Course[] coursesOffered) {
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.headOfDepartment = headOfDepartment;
        this.coursesOffered = coursesOffered;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(int deptCode) {
        this.deptCode = deptCode;
    }

    public Professor getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(Professor headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public Course[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(Course[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    @Override
    public String toString() {
        return
                "deptName='" + deptName +
                ", deptCode=" + deptCode +
                ", headOfDepartment=" + headOfDepartment +
                ", coursesOffered=" + Arrays.toString(coursesOffered) ;
    }
}
