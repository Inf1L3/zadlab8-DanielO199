/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborki8;

public class Tractor extends Product {
 
    
    public Tractor(String name, double price, String describe)
    {
        super(name, price, describe);
    }

    

    public void buy() {
        System.out.println(
                "I bought a black tractor, capaciticy 2400!");
    }

    public void showInfo() {
        System.out.println(
               "Price:" + getPrice()
               + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }

    private String getName() {
        return name;
 }

    private String getDescribe() {
        return describe;}

    
}