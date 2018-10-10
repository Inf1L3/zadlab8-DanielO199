package labo1;


public class Mechanik extends Pracownik {
    public Mechanik(String Imie,String Nazwisko, int Wiek){
    super(Imie,Nazwisko,Wiek,"Mechanik");
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
