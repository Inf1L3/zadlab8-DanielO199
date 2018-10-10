
package labo1;


public class Piekarz extends Pracownik {
    public Piekarz(String Imie, String Nazwisko,int Wiek){
    super(Imie,Nazwisko,Wiek,"Piekarz");
    
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
    @Override
    public  void Mow(){};
}
