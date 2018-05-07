package laborki8;
import lab8.*;
import java.lang.Math;

public class Kula extends FiguraPrzestrzenna{
    
    private int r;

    public Kula(int r) {
        this.r = r;
    }

    @Override
    public int obliczObjetosc() {
       return (int) (Math.PI * r *r* r*4/3);
    }

    @Override
    public int obliczPole() {
        return (int) (Math.PI * 4 * r*r);
    }

    @Override
    public String toString() {
        return super.toString()+"Pole:"+obliczPole()+"Objetosc"+obliczObjetosc();
    }

    
}
