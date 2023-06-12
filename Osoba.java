import java.util.Objects;
/**
 * <Klasa Osoba zawiera Konstruktor, equals oraz hashcode>
 *     <imie>:<string><przechowuje imie></></string></imie>
 *     <nazwisko>:<string><przechowuje nazwisko></></string></nazwisko>
 *     <wiek>:<integer><przechowuje wiek></></integer></wiek>
 * @author: <Igor><Wisniewski>
 * **/
public class Osoba {
   public String imie;
   public String nazwisko;
   public Integer wiek;

    public Osoba(String imie, String nazwisko, Integer wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) && Objects.equals(nazwisko, osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }
}
