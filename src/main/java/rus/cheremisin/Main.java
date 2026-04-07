package main.java.rus.cheremisin;

import rus.cheremisin.geomlibrary.Circle;
import rus.cheremisin.geomlibrary.Rectangle;
import rus.cheremisin.geomlibrary.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Круг c радиусом = " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

        System.out.println("=================================");

        System.out.println("Прямоугольник " + rectangle.getWidth() +
                " Х " + rectangle.getHeight());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        System.out.println("=================================");
        
        System.out.println("Треугольник " + triangle.getSideA() +
                " Х " + triangle.getSideB() + " Х " + triangle.getSideC());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
    }
}