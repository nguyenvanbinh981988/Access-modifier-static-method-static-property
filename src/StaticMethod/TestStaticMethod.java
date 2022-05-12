package StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.charge();

        Student S1 = new Student(123,"Binh");
        Student S2 = new Student(234,"Tinh");
        Student S3 = new Student(345,"Hoi");

        S1.display();
        S2.display();
        S3.display();
    }
}
