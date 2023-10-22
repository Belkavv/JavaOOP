package HomeWork_6.DIP;

public class PetrolEngine implements Engine {

    /**
     *  Модуль нижнего класса, зависящий от абстракции Engine.
     */
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }
}
