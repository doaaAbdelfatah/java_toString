package unvirsity;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Doaa" , "doaa@gmail.com" ,40);

        Student s1 = new Student("Mohamed" , "moh@gmail.com" , 32, 1000);
        Student s2 = new Student("Mai" , "mai@gmail.com" , 32, 1001);

//        Student [] students = {s1 , s2};

        Course c1 = new Course(150 , "Java");
        Course c2 = new Course(151 , "Html");
        Course c3 = new Course(152 , "CSS");
        Course c4 = new Course(153 , "Javascript");

//        c1.setStudentsEnrolled(students);
        c1.addStudent(s1);
        c1.addStudent(s2);
1
        Course [] courses ={c1 , c2 , c3 ,c4};

        Department department = new Department("Devlopment" ,100 , p);
        department.setCoursesOffered(courses);

        Student s3 = new Student("Dana" , "dana@gmail.com" , 20 ,1005);
        c1.addStudent(s3);

        c1.addStudent(new Student("Sara" ,"sara@gmail.com" ,10 , 1007));
        c1.removeStudent(1001);

        c3.addStudent(s3);
        c3.addStudent(s2);



    }
}
