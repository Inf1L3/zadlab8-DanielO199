
package laborki8;

import lab8.*;


public class Trojkat extends FiguraPlaska {
    
    private int a;
    private int b;
    private int c;

    public Trojkat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int obliczObwod(){
        
        return a+b+c;
    }
    
    public int obliczPole(){
    
    return (a*b)/2;
    }

    @Override
    public String toString() {
        return super.toString()+" Pole: " + obliczPole() + "Obwod: " + obliczObwod();
    }
    
    
   
    
    
}
