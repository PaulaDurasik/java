

import java.util.ArrayList;
import java.util.List;

public class Firma {
    String imie;

    List<Osoba> listaPracownikow=new ArrayList<>();


    public Firma(String imie) {
        this.imie=imie;
    }


//VARARGS
    void dodajPracownika(Osoba first,Osoba... osoba){
        System.out.println("Liczba osob do dodania"+(osoba.length+1)+"\t");
        listaPracownikow.add(first);
        for (int i = 0; i <osoba.length ; i++) {
            listaPracownikow.add(osoba[i]);


        }

    }

    void wyswietlPracownika(){
        for(Osoba osoba: listaPracownikow)
            System.out.println(String.format("%s  -%s (%s.l) -%s-zl", osoba.getImie(), osoba.getPlec(), osoba.getWiek(), osoba.getPensja()));


        }



    void wysietlWgPleci(){
        for (Osoba osoba: listaPracownikow) {
            if(osoba.getPlec()==Plec.KOBIETA){
                System.out.println(osoba.getImie());
            }

        }
    }

    void sredniaPensja(){
        int suma=0;
        int wynik=0;
        for (Osoba osoba: listaPracownikow){
            suma+=osoba.getPensja();
        }
        wynik=suma/listaPracownikow.size();
        System.out.println("Srednia pensja"+wynik);
    }


    void dajodwyżkę(){
        int podwyzka=0;
        double procentowa=0;
        for (Osoba osoba: listaPracownikow){

            osoba.setPensja(osoba.getPensja()+100);
            System.out.println(String.format("%s  -%s (%s.l) -%s-zl", osoba.getImie(), osoba.getPlec(), osoba.getWiek(), osoba.getPensja()));
        }

    }
}

