package Niedziela511;

public class MainShoping {

    public static void main(String[] args) {
        //shop();
       // company();


        Regex regex=new Regex();
        regex.match("http://www.wp.pl","^https?://(www)?.*\\.([a-z]+.)+[a-z].+");
        regex.match("http://onet.poczta.pl","^https?://(www)?.*\\.([a-z]+.)+[a-z].+");
        regex.match("p@gmail.com","^[a-z0-9]{1}+[_.-]?+@([a-z]+.)+[a-z{2,}]+");




    }

    private static void company() {
       // Company company=new Company();
        //company.addEmploye();
        //company.showAllKeys();
        //company.showAllNames();
        //company.getEmployye(56);
        //company.showAll();
        Counter counter=new Counter();
        counter.countreVoid();


    }
    void seeKay(){

    }

    private static void shop() {
        Client c1=new Client("Anna");
        Client c2=new Client("Tomasz");
        Client c3=new Client("Bartosz");
        Shop shop=new Shop();


        c1.printList();
        c1.sumOfPrice();
        shop.addClienttoQueue(c1,c2,c3);
        shop.startService();

    }
}
