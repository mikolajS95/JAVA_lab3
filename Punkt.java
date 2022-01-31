/* klasa Punkt */
/* stworzyć zmienne prywatne pX, pY, pZ */

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;
        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */

public class Punkt
{
    private int pX;
    private int pY;
    private int pZ;

    Punkt() {
    }

    Punkt(int pX)
    {
     this.pX = pX;
    }
    Punkt(int pX, int pY, int pZ)
    {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    public int getPX() {
      return pX;
    }
    public void setPX(int newpX) {
        this.pX= newpX;
    }
    public int getPY() {
        return pY;
    }
    public void setPY(int newpY) {
        this.pY= newpY;
    }
    public int getPZ() {
        return pZ*10;
    }
    public void setPZ(int newpZ) {
        this.pZ= newpZ;
    }

    public int suma()
    {
        return pX+pY+pZ;
    }

    public int roznica()
   {
        return pX - pY - pZ;
   }

    public int roznica(int x, int y, int z)
    {
        return pX*x - pY*y - pZ*z;
    }

    public String toString() {
        return "Punkt{" + "pX=" + pX + ", pZ=" + pZ + ", pY=" + pY + '}';
    }
}
