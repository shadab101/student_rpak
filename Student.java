package student.project;

import java.util.Arrays;
import java.util.LinkedList;

public class Student {
    private int roll_no;
    private String[] courses;
    public String college;
    public LinkedList<Student> students = new LinkedList<>();


    public Student(int roll_no,String[] courses) {
        this.roll_no = roll_no;
        this.courses=courses;
        this.college = "BMSIT";
    }
    public Student()
    {

    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getCollege() {
        return college;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    public void addStudents(Student al)
    {
        students.add(al);

    }
    public void removeStudent(int roll) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getRoll_no()==roll)
            {
//               String[] co= students.get(i).courses;
//               for(String s:co)
//                   System.out.println(s);
                students.remove(--roll);
            }
        }
    }

    public void displayStudents()
    {
        for (Student student: students)
        {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", courses=" + Arrays.toString(courses) +
                ", college='" + college + '\'' +
                '}';
    }
}
