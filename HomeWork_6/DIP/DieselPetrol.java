package HomeWork_6.DIP;

public class DieselPetrol implements Engine {

    /**
     * Модуль нижнего класса, зависящий от абстракции Engine.
     */
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}