/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborki8;

import lab8.*;

/**
 *
 * @author XxX
 */
public class Trapez extends FiguraPlaska {
    
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public Trapez(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e=e;
    }
    

    @Override
    public int obliczObwod() {
        return a+b+c+d;
        
    }

    @Override
    public int obliczPole() {
        return (a+b)*e/2;
        
    }

    @Override
    public String toString() {
        return super.toString()+" Pole: " + obliczPole() + "Obwod: " + obliczObwod();
    }
    
    
}
