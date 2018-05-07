package laborki8;

import lab8.*;


public class Szescian extends FiguraPrzestrzenna {
    
     private int a;
    private int b;
    private int c;

    public Szescian(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int obliczObjetosc() {
        return a*b*c;
    }

    @Override
    public int obliczPole() {
        return (2*a*b)+(2*a*c)+(2*b*c);
    }

    @Override
    public String toString() {
        return super.toString()+"Pole:"+obliczPole()+"Objetosc:"+obliczObjetosc();
    }
    
    

    
    
}
