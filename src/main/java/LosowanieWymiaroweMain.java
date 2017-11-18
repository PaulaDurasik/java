public class LosowanieWymiaroweMain {

    public static void main(String[] args) {
        LosowanieWymiarowe losowani=new LosowanieWymiarowe();
        losowani.rozmiarTablicy(5,5);
        losowani.wypełnijTablic(10,30);
        losowani.show();
        losowani.showColum(1);
        losowani.showWiersz(2);
        losowani.sumaWTablicy();
    }
}
