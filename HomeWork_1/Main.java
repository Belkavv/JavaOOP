package HomeWork_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BottleOfWater> listProduct = new ArrayList<>();
        listProduct.add(new BottleOfWater("Cola", 5, 2));
        listProduct.add(new BottleOfWater("Fanta", 4, 2));
        listProduct.add(new BottleOfWater("Milk", 3, 1));
        listProduct.add(new BottleOfWater("Tea", 2, 1));
        listProduct.add(new BottleOfWater("Water", 1.5, 1));
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(listProduct);
        System.out.println("Холодные напитки:" + '\n');
        System.out.println(vendingMachine.getProduct("Cola"));
        System.out.println(vendingMachine.getProduct("Fanta"));
        System.out.println(vendingMachine.getProduct("Milk"));
        System.out.println(vendingMachine.getProduct("Milk", 2));
        System.out.println(vendingMachine.getProduct("Tea"));
        System.out.println(vendingMachine.getProduct("Water"));

        List<HotDrink> hotDrinkList = new ArrayList<>();
        hotDrinkList.add(new HotDrink("coffee", 3.5, 0.2, 80));
        hotDrinkList.add(new HotDrink("tea", 2, 0.3, 95));
        hotDrinkList.add(new HotDrink("milk", 5, 0.25, 75));
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(hotDrinkList);
        System.out.println("Горячие напитки:" + '\n');
        System.out.println(hotDrinkVendingMachine.getProduct("coffee", 0.2, 80));
        System.out.println(hotDrinkVendingMachine.getProduct("tea", 0.3, 95));
        System.out.println(hotDrinkVendingMachine.getProduct("milk", 0.25, 75));
        System.out.println(hotDrinkVendingMachine.getProduct("coffee", 0.3, 95));

    }
}
