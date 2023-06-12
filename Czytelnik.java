
/**
 * <Klasa Czytelnik zawiera Konstruktor, wypiszksiazki oraz tostring>
 *     <lista>:<Ksiazka><przechowuje liste></></Ksiazka></lista>
 * @author: <Igor><Wisniewski>
 * **/


public class Czytelnik extends Osoba{
    public Ksiazka lista;


    public Czytelnik(String imie, String nazwisko, Integer wiek) {
        super(imie, nazwisko, wiek);
    }
    public String wypiszksiazki(){
        return String.valueOf(lista);
    }

    @Override
    public String toString() {
        return "Czytelnik{" +
                "lista=" + lista +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
