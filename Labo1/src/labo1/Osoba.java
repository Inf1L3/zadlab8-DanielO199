package labo1;


public abstract class Osoba {
    
private String Imie;
private String Nazwisko;
private int Wiek; 

public Osoba(String Imie, String Nazwisko, int Wiek)
{

	this.Imie=Imie;
	this.Nazwisko=Nazwisko;
	this.Wiek=Wiek;
}

   
    public String PokazDane() {
        return "Osoba{" + "Imie=" + Imie + ", Nazwisko=" + Nazwisko + ", Wiek=" + Wiek + '}';
    }



public abstract void Mow();

}
    

