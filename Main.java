import java.util.ArrayList;

       /**
        * <Klasa main zawiera wywołanie 3x Ksiazki, zawiera ArrayListe oraz Lambde która sortuje liste>
        * @author: <Igor><Wisniewski>
        * **/

public class Main {
    public static void main(String[] args) {
    new Ksiazka();
    new Ksiazka();
    new Ksiazka();

        ArrayList<Osoba> list = new ArrayList<>();
        list.add(new Osoba("Igor","WIsniewski",17));
        list.add(new Czytelnik("Przemysław","Jedlikowski",32));
        list.add(new Recenzent("Adam","Karczewski",24));
        System.out.println(list);

}}