

package javaapplication19;



    public class Tractor extends Product {

    public Tractor(String name, double price, String describe) {
        super(price, name, describe);
    }

    public void buy() {
        System.out.println(
                "I bought a black tractor, capaciticy 2400!");
    }

    @Override
    public void showInfo() {
        System.out.println(
               "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
}
    

