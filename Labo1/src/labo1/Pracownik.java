package labo1;


public abstract class Pracownik extends Osoba {
    private String Zawod;
        
    public Pracownik(String Imie, String Nazwisko, int Wiek, String Zawod){
    super(Imie,Nazwisko,Wiek);
    this.Zawod=Zawod;
    }

    @Override
    public String PokazDane() {
        return "Pracownik{" + "Zawod=" + Zawod + '}'+ super.PokazDane();
    }
    
    public abstract void WykonajPrace();
}
