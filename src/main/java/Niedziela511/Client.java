package Niedziela511;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    String name;
    List<Product> shopinglist=new ArrayList();



    public Client(String name){
        this.name=name;
        addRandomProducts();

    }

    public void addRandomProducts() {
        Random r=new Random();

        for (int i = 0; i <r.nextInt(5)+1 ; i++) {
            shopinglist.add(Product.example.get(r.nextInt(Product.example.size())));
        }

    }


    public String getName() {
        return name;
    }

    public List <Product> getShopinglist(String nameOfProduct, int price) {
        return shopinglist;
    }

    void makeaList(Product first, Product... product){
        shopinglist.add(first);
        for (int i = 0; i <product.length ; i++) {
            shopinglist.add(product[i]);


        }

    }

    void printList(){
        System.out.println("Zakup klienta"+ name);
        for (Product product: shopinglist) {
            System.out.println(String.format("%s nazwa:,%s-zł", product.getNameOfProduct(), product.getPrice()));

        }

    }

    void sumOfPrice(){
        System.out.println("Zakupy klienta"+name);
        int suma=0;
        for(Product product:shopinglist){
            suma+=product.getPrice();


        }System.out.println("Za zakupy zapłcisz"+ suma);
    }

    public List <Product> getShopinglist() {
        return shopinglist;
    }
    //    void vieClient(){
//
//        for(Product product: shopinglist){
//            System.out.println(String.format("s%, s%nazwa:, s%- zł", client.getName(),client.getShopinglist(producy.getNameOfProduct(),producy.getPrice()
//                    )));
//

        }
//    }
//}
