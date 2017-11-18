package Niedziela511;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {

    String nameOfProduct;
    int price;

    public Product(String nameOfProduct, int price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static List<Product> example=new ArrayList<>(Arrays.asList(
            new Product("Cabage", 10),
    new Product("flour", 2),
    new Product("Chocolade", 5),
    new Product("bread", 2),
    new Product("flowers", 20),
    new Product("jeam", 2),
    new Product("humus", 10),
    new Product("papric", 2),
    new Product("Carrot", 10),
    new Product("cucumber", 2)
    ));


}
