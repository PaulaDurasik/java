public class Main {
    public static void main(String[] args) {
        company();


    }

    private static void company() {
        Firma firma=new Firma("SDA");
        Osoba osoba1=new Osoba("Paula",29,2100,Plec.KOBIETA);
        Osoba osoba2=new Osoba("Maria",35,3000,Plec.KOBIETA);
        Osoba osoba3=new Osoba("Maciej",25,5000,Plec.MEZCZYZNA);
        firma.dodajPracownika(osoba1,osoba2,osoba3);

        firma.wyswietlPracownika();
        firma.wysietlWgPleci();
        firma.sredniaPensja();
        firma.dajodwyżkę();

    }






}
