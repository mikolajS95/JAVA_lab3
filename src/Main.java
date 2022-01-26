public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        System.out.println("Zadanie 1:");

        int i = 1000;
        int dwieOstatnieCyfryIndexu=25;
        int x =0;

        do {
            if(i%dwieOstatnieCyfryIndexu==0)
            {
                System.out.println("Liczba " + i + " podzielna przez " + dwieOstatnieCyfryIndexu);
            }

        } while(i--!=1);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        System.out.println("Zadanie 2: ");
        int[] tab = {1, 2, 3, 5, 8};
        int counter =0;

        System.out.println("Wartości tablicy int: ");
        while (counter< tab.length)
        {
            System.out.println(tab[counter++]);
        }
        double[] tabDouble = {1.01, 2.02, 3.03, 5.05, 8.08};
        int counter2 =0;

        System.out.println("Wartości tablicy double: ");
        while (counter2< tabDouble.length)
        {
            System.out.println(tabDouble[counter2++]);
        }


        String[] stringTab = {"jeden", "dwa", "trzy", "cztery", "pięć"};
        int counter3 =0;

        System.out.println("Wartości tablicy string: ");
        while (counter3< stringTab.length)
        {
            System.out.println(stringTab[counter3++]);
        }


        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        System.out.println("Zadanie 3:");

        while(true)
        {
            System.out.println("Pętla nieskończona");
        }
        while(false)
        {
            System.out.println("Pętla się nie wykona");
        }

    }
}
