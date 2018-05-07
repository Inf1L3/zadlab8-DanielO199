package laborki8;

import lab8.*;


public class Rownoleglobok extends FiguraPlaska {
    
    private int a;
    private int b;

    public Rownoleglobok(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int obliczObwod() {
        return a+b+a+b;
        
    }

    @Override
    public int obliczPole() {
       return a*b;
    }

    @Override
    public String toString() {
        return super.toString()+"Pole: "+obliczPole()+"Obwod: "+obliczObwod();
    }
    
    
    
    
}
