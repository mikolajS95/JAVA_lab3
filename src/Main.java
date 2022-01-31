import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        Osoba a = new Osoba("Karol", "Krawczyk", 12345);
        Osoba b = new Osoba("Tadeusz", "Norek", 23346);
        Osoba c = new Osoba("Danuta", "Norek", 12365);
        Osoba d = new Osoba("Alina", "Krawczyk", 34234);
        Osoba e = new Osoba("Roman", "Kurski", 12654);


        List<Student> listaStudentow = new ArrayList<>();

        Student jeden = new Student();
        listaStudentow.add(jeden);
        Student dwa = new Student();
        listaStudentow.add(dwa);
        Student trzy = new Student();
        listaStudentow.add(trzy);
        Student cztery = new Student();
        listaStudentow.add(cztery);
        Student piec = new Student();
        listaStudentow.add(piec);

        for (Student x : listaStudentow)
        {
            System.out.println(x.toString());
        }

    }
}