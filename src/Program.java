import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        System.out.println("Podaj imie");
        emp1.setImie(scan.nextLine());

        System.out.println("Podaj nazwisko");
        emp1.setNazwisko(scan.nextLine());

        System.out.println("Podaj wypate");
        scan.useLocale(Locale.US);
        emp1.setWyplata(scan.nextDouble());

        System.out.println("Podaj imie");
        emp2.setImie(scan.nextLine());

        System.out.println("Podaj nazwisko");
        emp2.setNazwisko(scan.nextLine());

        System.out.println("Podaj wypate");
        scan.useLocale(Locale.US);
        emp2.setWyplata(scan.nextDouble());



        Company company = new Company();

        company.add(emp1);
        company.add(emp2);

    }
}