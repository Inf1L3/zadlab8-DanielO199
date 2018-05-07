package laborki8;

import lab8.*;

public class Prostopadloscian extends FiguraPrzestrzenna {
    
    private int a;

    public Prostopadloscian(int a) {
        this.a = a;
    }

    @Override
    public int obliczObjetosc() {
        return a*a*a;
    }

    @Override
    public int obliczPole() {
        return a*a*6;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"Pole:"+obliczPole()+"Objetosc:"+obliczObjetosc();
    }
    
}
