package Lession5;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập màu");
        String color = scanner.nextLine();

        System.out.println("Nhập cạnh 1");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập cạnh 2");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập cạnh 3");
        double side3 = scanner.nextDouble();

        triangle = new Triangle(color, side1,side2,side3);
        System.out.println(triangle);

    }
}

