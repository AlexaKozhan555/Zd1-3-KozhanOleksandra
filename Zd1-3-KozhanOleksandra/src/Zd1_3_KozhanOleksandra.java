import java.util.Scanner;

public class Zd1_3_KozhanOleksandra {
    public static void main(String[] args) {
        Scanner Scan_KozhanOleksandra = new Scanner(System.in);
        System.out.println("Wpisz lizbę 1: ");
        float pierLiczba_KozhanOleksandra = Scan_KozhanOleksandra.nextFloat();

        System.out.println("Wpisz lizbę 2: ");
        float drugaLiczba_KozhanOleksandra = Scan_KozhanOleksandra.nextFloat();

        float suma_KozhanOleksandra = pierLiczba_KozhanOleksandra + drugaLiczba_KozhanOleksandra;
        float roznica_KozhanOleksandra = pierLiczba_KozhanOleksandra - drugaLiczba_KozhanOleksandra;
        float iloczyn_KozhanOleksandra = pierLiczba_KozhanOleksandra * drugaLiczba_KozhanOleksandra;
        float iloraz_KozhanOleksandra = pierLiczba_KozhanOleksandra / drugaLiczba_KozhanOleksandra;

        System.out.println("suma = " + suma_KozhanOleksandra + " roznica = " + roznica_KozhanOleksandra + " iloczyn = " + iloczyn_KozhanOleksandra
                + " iloraz = " + iloraz_KozhanOleksandra);
    }
}
