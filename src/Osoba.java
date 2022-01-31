/* zad.1
           a) Stworzyć klasę Osoba z polami prywatnymi:
           - imie (String),
           - nazwisko (String),
           - indeks (Integer)
           b) stworzyc konstruktory, gettery i settery
           c) napisać metodę w klasie Osoba która zwróci informację o osobie,
        */

public class Osoba
{
    private String imie;
    private String nazwisko;
    private int indeks;

    public Osoba() { }

    public Osoba(String imie, String nazwisko, int indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

   public String OdczytajOsobe()
   {
       return getImie() + getNazwisko() + getIndeks();
   }
}

