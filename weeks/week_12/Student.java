package weeks.week_12;

public class Student {
    private static int studentCounter;

    private String name;
    private String lastName;
    private int id;
    private String email;
    public final static String ACADEMY = "Inar Academy";

    public String publicAccessModifier;
    String defaultAccessModifier;
    private String privateAccessModifier;
    protected String protectedAccessModifier;

    public Student() {

        this("", "", 0, "");
    }
    public Student(String name, String lastName, int id, String email) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        studentCounter++;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    public int getId() {

        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void print() {
        System.out.printf("Name:%s\nLastname:%s\nId:%d\nEmail:%s\n",this.name, this.lastName, this.id, this.email);
        System.out.println("-------");
    }
    public static int getStudentCounter() {
        return studentCounter;
    }
}
