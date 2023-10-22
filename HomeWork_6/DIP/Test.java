package HomeWork_6.DIP;

public class Test {

    /**
     * Для объекта Car главынм является зависимость от абстракции Engine в независимости от типа двигателя.
     */
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselPetrol());
        car.start();
    }
}
