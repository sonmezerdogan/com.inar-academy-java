package chapters.chapter_11.Exercises_11.E05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course(String courseName) {

        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.numberOfStudents = 0;
    }
    public String getCourseName() {
        return courseName;
    }
    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }
    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void dropStudent(String student) {
        if(student.contains(student)){
            students.remove(student);
            numberOfStudents--;
        }else {
            System.out.println("No students named : "+student);
        }

    }
}
