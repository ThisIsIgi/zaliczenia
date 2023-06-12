/**
 * <Klasa Recenzet zawiera Konstruktor, wypiszksiazki>
 * @author: <Igor><Wisniewski>
 * **/

public class Recenzent extends Czytelnik{
    public Recenzent(String imie, String nazwisko, Integer wiek) {
        super(imie, nazwisko, wiek);
    }
    public String wypiszksiazki(){

        return String.valueOf(lista+"ocena : 2");
    }
}
