
package laborki8;

import lab8.*;


public class Walec extends FiguraPrzestrzenna {
    
    private int r;
    private int h;

    public Walec(int r,int h) {
        this.r = r;
        this.h=h;
    }

    

    @Override
    public int obliczObjetosc() {
       return (int) (Math.PI * h * r*r);
    }

    @Override
    public int obliczPole() {
        return (int) (Math.PI * 2 * r*r);
    }

    @Override
    public String toString() {
        return super.toString()+"Pole:"+obliczPole()+"Objetosc:"+obliczObjetosc();
    }
    
    
}
