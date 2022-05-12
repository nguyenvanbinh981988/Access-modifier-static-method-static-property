package Accessmodifier;

public class Circlemain {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Radius: " + circle1.getArea());

        Circle circle2 = new Circle(5.0,"yellow");

        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Radius: " + circle2.getArea());

    }
}
