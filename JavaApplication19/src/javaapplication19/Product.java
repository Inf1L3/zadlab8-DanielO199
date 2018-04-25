package javaapplication19;

 public class Product {

    private double price;
    private String name;
    private String describe;
    
    
    public Product(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;

    }

    public double getPrice() {
        return price;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescribe(){
        return describe;
    
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    public  void buy(){};

    public  void showInfo(){};
    
    
    
    }

