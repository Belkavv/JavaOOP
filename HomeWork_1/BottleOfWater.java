package HomeWork_1;

public class BottleOfWater extends Product {

    private double volume;

    public BottleOfWater(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" + "\n" +
                "name = " + super.getName() + "\n" +
                "price = " + super.getPrice() + "\n" +
                "volume = " + volume + "\n" +
                "} " + '\n';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
