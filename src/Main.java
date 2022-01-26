import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        System.out.println("Zadanie 1: ");

        int ostatniaCyfraIndexu =5;

        for (int i= 100; i>0; i--)
        {
            System.out.print(i%ostatniaCyfraIndexu==0 ? "\nLiczba " + i + " jest podzielna przez ostatnią cyfrę indexu (czyli 5)" : "");
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        System.out.println("\n\nZadanie 2: ");

        Scanner scan  = new Scanner(System.in);
        int tab[] = new int[5];

        for (int x=0; x<5;x++)
        {
            System.out.println("\nPodaj liczbę: ");
            int liczba = scan.nextInt();

            tab[x]= liczba;
        }

        for (int z : tab)
        {
            System.out.println(z + 11);
        }
    }
}
