package Baitap_Accessmodifier;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Name : " + student1.getName());
        System.out.println("Classes : " + student1.getClasses());

        student1.setName("Binh");
        student1.setClasses("C0322G1");
        System.out.println("Name : " + student1.getName());
        System.out.println("Classes : " + student1.getClasses());

    }
}
