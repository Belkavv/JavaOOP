package HomeWork_1;

public class HotDrink extends Product{
    private int temperature;
    private  double volume;


    public HotDrink(String name, double price, double volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" + '\n' +
                "name = " + super.getName() + '\n' +
                "price = " + super.getPrice() + '\n' +
                "volume = " + volume + '\n' +
                "temp = " + temperature +
                "} " + '\n';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temp) {
        this.temperature = temperature;
    }
}
