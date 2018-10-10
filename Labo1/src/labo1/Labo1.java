package labo1;


public class Labo1 {
 
    
    public static void main(String[] args) {
       
        Osoba[] tab = new Osoba[4];
         tab[0] = new Piekarz("Marcin", "Lolo", 30);
         System.out.println(tab[0].PokazDane());
          tab[1] = new Murarz("Daniel", "Ochabson", 9);
         System.out.println(tab[1].PokazDane());
          tab[2] = new Nauczyciel("Jaroslaw", "Chusteczek", 60);
         System.out.println(tab[2].PokazDane());
          tab[3] = new Mechanik("Dominika", "Rudy", 100);
         System.out.println(tab[3].PokazDane());
          
    }
    
}
