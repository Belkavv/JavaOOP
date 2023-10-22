package HomeWork_6.LSP;

public class Rectangle extends QuadRangle {

    /**
     * Наследник класса QuadRangle, определяющий длину и ширину прямоугольника, а так же считающий его площадь.
     */
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
