import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        // a)
        enum LiczbaENUM
        {
            jeden, dwa, trzy, cztery, pięć, sześć;
        }
        // b)
        enum StatusENUM
        {
            KONTYNUUJEMY, KONIEC
        }
        // c) & d)
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.print("Podaj liczbę: ");
            int liczba= scan.nextInt();
            if(liczba==0)
            {
                System.out.println(StatusENUM.KONIEC);
                System.out.println();
                break;
            }

            switch (liczba)
            {
                case 1:
                    System.out.println(LiczbaENUM.jeden);
                    break;
                case 2:
                    System.out.println(LiczbaENUM.dwa);
                    break;
                case 3:
                    System.out.println(LiczbaENUM.trzy);
                    break;
                case 4:
                    System.out.println(LiczbaENUM.cztery);
                    break;
                case 5:
                    System.out.println(LiczbaENUM.pięć);
                    break;
                case 6:
                    System.out.println(LiczbaENUM.sześć);
                    break;
                default:
                    System.out.println("Błędna wartość. Wybierz wartość z przedziału 1 - 6 lub 0 by zakończyć.");
            }
            System.out.println(StatusENUM.KONTYNUUJEMY);
            System.out.println();
        }

    }
}