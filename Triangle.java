package Lession5;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    public Triangle(String color){
        super(color);
    }
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Double getArea() {
        double c = side1+side2+side3;
        return c;
    }

    public Double getPerimeter(){
        double c = side1+side2;
        return c;
    }
    public String toString(){
        return /*"cạnh 1 = "+side1
                +",cạnh 2 = "+side2
                +",canh 3 = "+side3*/
                " màu sắc ="+getColor()
                +", chuvi ="+getArea()
                +", dien tich =" + getPerimeter();
    }
}
