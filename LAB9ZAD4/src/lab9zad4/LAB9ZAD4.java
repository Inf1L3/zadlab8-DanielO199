package lab9zad4;
import java.util.HashMap;
import java.util.Scanner;

public class LAB9ZAD4 {
/*SPUSHOWANE DO ZLEGO REPOZYTORIUM*/
    
    public static void main(String[] args) {
        
        HashMap<String, String> slownik = new HashMap<>();
        Scanner input=new Scanner(System.in);
        Slowa slowa1=new Slowa();
        slowa1.Elo(slownik);
        String a=" ";
        
        while(!a.equals("koniec"))
           {
             
              System.out.println("Podaj słowo ktore chcesz przetlumaczyc:");
              a = input.nextLine();
              
               
               
              if(!slownik.containsKey(a))
              {
                  System.out.println("Takiego slowa nie ma w slowniku ");
             
              }
              else
                    System.out.println(slownik.get(a));
               System.out.println("Jesli chcesz zakonczyc napisz koniec");
          } 
      
}
}
