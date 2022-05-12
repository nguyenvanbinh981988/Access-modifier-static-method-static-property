package StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "Rmit";

    Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }

    static void charge(){
        college = "Codegym";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
