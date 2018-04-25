
package laborki8;


public class Laborki8 {

    
    public static void main(String[] args) {
        
        
         Product[] tab = new Product[10];
        
       tab[0] = new Book("book1", 20, "ksiazka1");
       
        tab[2] = new Book("book2", 220, "ksiazka2");
        tab[3] = new Dlugopis("Pen1",120, "Długopis1");
        tab[4] = new Dzem("Dzem1", 5.50, "Wisniowy");
        tab[5] = new Polopiryna("Polopiryna1", 50, "apap");
        tab[6] = new Dzem("Dzem2", 5.50, "Truskawkowy");
      
        tab[8] = new Dlugopis("Pen2",120, "Długopis2");
        tab[9] = new Tractor("Tractor1", 5000, "Ursus");
       
        
        for(int i=0; i<10; i++)
        {
            tab[i].buy();
            tab[i].showInfo();
        }
       
    }
    
}
