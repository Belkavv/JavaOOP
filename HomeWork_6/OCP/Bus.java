package HomeWork_6.OCP;

public class Bus extends Vehicle{

    /**
     * Является расширением класса Vehicle.
     */
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
}
