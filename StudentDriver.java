package student.project;

import java.util.ArrayList;

public class StudentDriver {
    public static void main(String[] args) {

        Student student = new Student();
        student.addStudents(new Student(1,new String[]{ "Maths", "Physics","English"}));
        student.addStudents(new Student(2,new String[]{ "Maths"}));
        student.addStudents(new Student(3,new String[]{"Chemistry"}));
        student.displayStudents();
        System.out.println();
        student.removeStudent(1);
        student.displayStudents();



    }
}
