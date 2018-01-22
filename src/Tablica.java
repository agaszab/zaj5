

import java.util.Locale;
import java.util.Scanner;

public class Tablica {

    public static void main(String[] arg) {


        Scanner scan = new Scanner(System.in);


        double[] liczby = new double[3];

        System.out.println("Podaj pierwszą liczbe");
        scan.useLocale(Locale.US);
        liczby[0] = scan.nextDouble();

        System.out.println("Podaj drugą liczbe");
        liczby[1] = scan.nextDouble();

        System.out.println("Podaj trzecią liczbe");
        liczby[2] = scan.nextDouble();

        double wynik=liczby[0]+liczby[1]+liczby[2];
        System.out.println(liczby[0]+"+"+liczby[1]+"+"+liczby[2]+" = "+wynik);
    }

}
