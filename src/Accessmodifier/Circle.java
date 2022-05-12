package Accessmodifier;

public class Circle {
    private double radius = 1.0;
    public static String color = "red";

    public Circle(){}

    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (this.radius*this.radius)*Math.PI;
    }
}
