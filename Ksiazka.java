/**
 * <Klasa Ksiazka zawiera to string>
 *     <tytul>:<string><przechowuje tytul></></string></tytul>
 *     <Autor>:<Osoba><przechowuje autor></></Osoba></Autor>
 *     <data_wydania>:<String><przechowuje date wydania></></string></data_wyDANIA>
 * @author: <Igor><Wisniewski>
 * **/

public class Ksiazka {
    public String tytul;
    public Osoba autor;
    public String data_wydania;

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor=" + autor +
                ", data_wydania='" + data_wydania + '\'' +
                '}';
    }
}
