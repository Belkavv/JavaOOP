package HomeWork_1;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{

    List<BottleOfWater> productList;

    public List<BottleOfWater> getProductList() {
        return productList;
    }

    public void setProductList(List<BottleOfWater> productList) {
        this.productList = productList;
    }

    public BottleOfWaterVendingMachine(List<BottleOfWater> productList){
        this.productList = productList;
    }

    public BottleOfWater getProduct(String name, double volume) {
        for (BottleOfWater bottleOfWater: productList){
            if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                return bottleOfWater;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name) {
        for (Product product: productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public void addBottleOfWater(BottleOfWater bottleOfWater){
        this.productList.add(bottleOfWater);
    }
}
