package laborki8;

import lab8.*;


public class Stozek extends FiguraPrzestrzenna{
    private int r;
    private int l;
    private int h;

    public Stozek(int r, int l, int h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }

    @Override
    public int obliczObjetosc() {
        return (int) (Math.PI * h * r*r*1/3);
    }

    @Override
    public int obliczPole() {
        return (int) ((int) (Math.PI * r*r) +r*l*Math.PI);
        
    }

    @Override
    public String toString() {
        return super.toString()+"Pole:"+obliczPole()+"Objetosc:"+obliczObjetosc();
    }
    
    
    
}
