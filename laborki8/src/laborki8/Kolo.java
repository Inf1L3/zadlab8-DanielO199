package laborki8;
import lab8.*;
import java.lang.Math;

public class Kolo extends FiguraPlaska {
    
    private int r;

    public Kolo(int r) {
        this.r = r;
    }

    @Override
    public int obliczObwod() {
        return (int) (Math.PI * 2 * r);
    }

    @Override
    public int obliczPole() {
        return (int) (Math.PI * r * r);
    }

    @Override
    public String toString() {
        return super.toString()+"Pole: " +obliczPole()+"Obwod: "+ obliczObwod();
        
    }
    
    
}
