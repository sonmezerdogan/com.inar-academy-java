package chapters.chapter_11.Exercises_11.E05;

public class Exercise05 {
    public static void main(String[] args) {
        Course course = new Course("Java");
        course.addStudent("Ali");
        course.addStudent("Can");
        course.addStudent("Tan");
        course.addStudent("Kaan");

        String[] students = course.getStudents();
        System.out.println("After adding students");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Number of students : "+ course.getNumberOfStudents());
        System.out.println("-------------------");

        course.dropStudent("Can");

        students = course.getStudents();
        System.out.println("After dropping student");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Number of students : "+ course.getNumberOfStudents());

    }
}
