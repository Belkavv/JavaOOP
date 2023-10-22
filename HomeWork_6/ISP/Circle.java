package HomeWork_6.ISP;

public class Circle implements Shape {

    /**
     *  Реализует интерфейс Shape, для нахождения площади 2D фигуры (круга).
     */
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }
}