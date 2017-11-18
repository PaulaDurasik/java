package Niedziela511;

import java.util.*;

public class Shop {
    List<Client> listOfClients=new LinkedList();
    Queue<Client> kolejka=new LinkedList <>();

    void addClienttoQueue(Client first,Client... client){
        kolejka.add(first);
        for (int i = 0; i <client.length ; i++) {
            kolejka.offer(client[i]);

        }


    }
    void vewClient(){
        for (Client client:kolejka) {
            System.out.println("Klienci w kolejce: " + client.getName());
        }
    }


    void startService(){
        System.out.println("Lista klientów przed obsłużeniem"+ kolejka.size());
        int suma=0;
        while (!kolejka.isEmpty()) {
            Client client = kolejka.poll();
            System.out.println(client.getName());
            Iterator <Product> it = client.getShopinglist().iterator();//iterator przechodzi po liście
            //hasNext boolean jak są to jesdzie dalej

                while (it.hasNext()) {
                    Product product = it.next();
                    System.out.println(String.format(" -%s %s\n ", product.getNameOfProduct(), product.getPrice()));
                    it.remove();
                    suma+=product.getPrice();
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(2000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


        }
        System.out.println("Lista klientów po" +  kolejka.size());
        System.out.println("Suma zarobione"+ suma);
    }


}
