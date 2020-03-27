package hu.botondudvardi;


import java.util.*;

/**
 * UGYFEL EMAILBEN JELZETT EGY KIS PONTATLANSAGOT:
 *
 * Sziasztok. Nagyon orulok, hogy most mar sorrendben latom a teendoket datum szerint!
 * De valami elromolhatott mert ha ket het mulva vagy kesobbi datumot akarok hozzaadni, akkor nem jo a datum.
 * Meg tudjatok nezni?
 * Koszi!
 */

public class DebugTask3 {


    public static void main(String[] args) {
        ToDoLista lista = new ToDoLista();
        lista.hozzaad(5, "Anya születésnapja!");
        lista.hozzaad(1, "Levinni a szemetet");
        Date ma = new Date();
        Date holnap = new Date(ma.getTime() + 24 * 60 * 60 * 1000);
        lista.hozzaad(holnap, "Autó szervíz");
        lista.hozzaad(2020, 7, 5, "Nyaralás kezdete");
        lista.hozzaad(14, "Fogorvos");
        System.out.println(lista.getEmlekeztetok());
    }

}

class ToDoLista {
    private Map<Date, List<String>> emlekeztetok = new HashMap();

    public ToDoLista() {
        emlekeztetok = new TreeMap();
    }

    public void hozzaad(Date datum, String szoveg) {
        List<String> szovegek = emlekeztetok.get(datum);
        szovegek.add(szoveg);
    }

    public void hozzaad(int e, int h, int n, String szoveg) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, e);
        cal.set(Calendar.MONTH, n);
        cal.set(Calendar.DATE, n);
        emlekeztetok.put(cal.getTime(), Arrays.asList(szoveg));
    }

    public void hozzaad(int hanyNapMulva, String szoveg) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, hanyNapMulva);
        ArrayList<String> teendok = new ArrayList();
        teendok.add(szoveg);
        emlekeztetok.put(c.getTime(), teendok);
    }

    public Map<Date, List<String>> getEmlekeztetok() {
        return emlekeztetok;
    }
}
