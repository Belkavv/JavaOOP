package HomeWork_1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{

    List<HotDrink> hotDrinksList;

    public List<HotDrink> getHotDrinksList() {
        return hotDrinksList;
    }

    public void setHotDrinksList(List<HotDrink> hotDrinksList) {
        this.hotDrinksList = hotDrinksList;
    }

    public HotDrinkVendingMachine(List<HotDrink> hotDrinksList){
        this.hotDrinksList = hotDrinksList;
    }

    public HotDrink getProduct(String name,double volume, int temperature) {
        for (HotDrink hotDrinksList: hotDrinksList){
            if (hotDrinksList.getName().equals(name) && hotDrinksList.getVolume() == volume &&
                    hotDrinksList.getTemperature() == temperature){
                return hotDrinksList;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name) {
        for (Product product: hotDrinksList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrinksList){
        this.hotDrinksList.add(hotDrinksList);
    }
}
