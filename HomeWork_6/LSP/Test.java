package HomeWork_6.LSP;

public class Test {

    /**
     * Создание объекта класса QuadRangle и подстановка в него объекта, который наследуется от QuadRangle,
     * программой будет выполняться правильно, без поломок.
     * Независимо от подстановки Rectangle или Square метод area() будет в любом случае искать площадь фигуры,
     * но будет делать это для разных фигур.
     */
    public static void main(String[] args) {
        QuadRangle quadRangle = new Rectangle(2, 2);
        System.out.println("Rectangle" + " " + quadRangle.area());
        quadRangle = new Square(3);
        System.out.println("Square" + " " + quadRangle.area());

    }
}
