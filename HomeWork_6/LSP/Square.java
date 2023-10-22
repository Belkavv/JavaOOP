package HomeWork_6.LSP;

public class Square extends QuadRangle {

    /**
     * Наследник класса QuadRangle, определяющий сторону квадрата, а так же считающий его площадь.
     */
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
