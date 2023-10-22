package HomeWork_6.ISP;

public interface Shape3D extends Shape {

    /**
     * Для трехмерных фигур можно найти как площадь сторон, так и объём фигуры.
     * Интрефейс Shape наследуется так как для трехмерных фигур так же характерна характеристика площади сторон.
     */
    public double volume();
}
