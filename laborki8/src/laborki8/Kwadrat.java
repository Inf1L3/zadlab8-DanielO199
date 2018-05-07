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
public  class Kwadrat extends FiguraPlaska {

    private int a;
    
    public Kwadrat(int a){
    
        this.a=a;
    }
    
    @Override
  public int  obliczObwod(){
    
    return 4*a;
    }
  
    @Override
  public int obliczPole(){
  
  return a*a;
  }

    @Override
    public String toString() {
        return super.toString() + "Pole : " + obliczPole() + "Obwod: " + obliczObwod();
    }
  
    
}
