package weeks.week_12;

public class StudentTest {
    public static void main(String[] args) {

        Student haluk = new Student("Haluk", "ınar", 425, "haluk@inar.com");

        haluk.setEmail("haluk@gmail.com");
        haluk.print();

        Student murat = new Student();
        murat.print();

        murat.setName("Murat");
        murat.setLastName("Inar");
        murat.print();

        murat.setId(897);
        murat.setEmail("murat@inar.com");

        int muratId = murat.getId();
        System.out.println("Id "+ muratId);

        String muratEmail = murat.getEmail();

        System.out.println("STUDENT NUMBER = " + Student.getStudentCounter());

        Student nurullah = new Student("Nurullah", "Inar", 765, "nurullah@inar.com");
        System.out.println("STUDENT NUMBER = " + Student.getStudentCounter());

        Student tarik = new Student();
        tarik.print();
        System.out.println(tarik.defaultAccessModifier);
        System.out.println(tarik.protectedAccessModifier);
    }
}
