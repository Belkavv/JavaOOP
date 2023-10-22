package HomeWork_6.OCP;

public class Car extends Vehicle{

    /**
     * Является расширением класса Vehicle.
     */
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
