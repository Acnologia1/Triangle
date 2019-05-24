package Lession5;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape(){}
    public Shape(String color)
    {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
