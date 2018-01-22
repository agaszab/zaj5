public class Wielowym {

    public static void main(String[] args) {

        int[][] liczby = new int[4][];
        liczby[0] = new int[3];
        liczby[1] = new int[2];
        liczby[2] = new int[4];
        liczby[3] = new int[1];

        liczby[0][0] = 1;
        liczby[0][1] = 2;
        liczby[0][2] = 3;
        liczby[1][0] = 4;
        liczby[1][1] = 5;
        liczby[2][0] = 6;
        liczby[2][1] = 7;
        liczby[2][2] = 8;
        liczby[2][3] = 9;
        liczby[3][0] = 10;

        int wynik = liczby[0][0] + liczby[1][0] + liczby[2][0] + liczby[3][0];
        System.out.println(wynik);

    }
}
