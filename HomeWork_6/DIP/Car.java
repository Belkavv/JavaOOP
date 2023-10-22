package HomeWork_6.DIP;

public class Car {

    /**
     * Класс верхнего уровня, зависящий от абстракции Engine.
     */
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
