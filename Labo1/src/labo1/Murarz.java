
package labo1;


public  class Murarz extends Pracownik{
    public Murarz (String Imie, String Nazwisko, int Wiek){
    super(Imie, Nazwisko, Wiek ,"Murarz"); 
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void WykonajPrace(){
    
    }
    
    
    @Override
   public String PokazDane(){
        return super.PokazDane();
   
   }
    public  void Mow(){};
    
    
}
