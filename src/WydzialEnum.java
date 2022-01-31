public enum WydzialEnum
{
    ;
    String nazwa;
    int numer;
    int rokOtworzenia;

    WydzialEnum()
    {
        String nazwa="Ekonomiczny";
        int numer= 12;
        int rokOtworzenia=2002;
    }

    WydzialEnum(String nazwa, int numer, int rokOtworzenia)
    {
        this.nazwa=nazwa;
        this.numer=numer;
        this.rokOtworzenia=rokOtworzenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getRokOtworzenia() {
        return rokOtworzenia;
    }

    public void setRokOtworzenia(int rokOtworzenia) {
        this.rokOtworzenia = rokOtworzenia;
    }

    public String toString()
    {
      return "\nNazwa wydziału: " + getNazwa() + "\nNumer wydziału: " + getNumer() + "\nRok otworzenia wydziału: " + rokOtworzenia;
    }
}

