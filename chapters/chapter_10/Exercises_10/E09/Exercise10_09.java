package chapters.chapter_10.Exercises_10.E09;

import chapters.chapter_10.Exercises_10.E09.Course;

public class Exercise10_09 {
    public static void main(String[] args) {

            Course c1 = new Course("DenemeKursu");
            c1.addStudent("Serhat");
            c1.addStudent("Ertugrul");
            c1.addStudent("Sinan");
            c1.displayStudents();

            System.out.println("-------------------------");
            c1.dropStudent("Serhat");
            c1.displayStudents();

            System.out.println("-------------------------");
            c1.clear();
            c1.displayStudents();

    }
}
