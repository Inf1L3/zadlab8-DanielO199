package labo1;


public  class Nauczyciel extends Pracownik{
    public Nauczyciel(String Imie, String Nazwisko, int Wiek){
    super(Imie,Nazwisko,Wiek,"Nauczyciel");
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
