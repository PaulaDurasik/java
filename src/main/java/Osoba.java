public class Osoba {
    String imie;
    int wiek;
    int pensja;
    Plec plec;

    public Osoba(String imie, int wiek, int pensja, Plec plec) {
        this.imie = imie;
        this.wiek = wiek;
        this.pensja = pensja;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public int getPensja() {
        return pensja;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }
}
