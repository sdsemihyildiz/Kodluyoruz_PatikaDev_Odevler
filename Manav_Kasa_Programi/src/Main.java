import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double armutF = 2.14, elmaF = 3.67, domatesF = 1.11, muzF = 0.95, patlicanF = 5.0;

        System.out.println("Alabileceğiniz ürünler");
        String urun = "Armut\n" + "Elma\n" + "Domates\n" + "Muz\n" + "Patlıcan";
        System.out.println(urun);
        System.out.println("***********");

        System.out.print("Armut Kaç Kilo: ");
        int armut = in.nextInt();
        System.out.print("Elma Kaç Kilo: ");
        int elma = in.nextInt();
        System.out.print("Domates Kaç Kilo: ");
        int domates = in.nextInt();
        System.out.print("Muz Kaç Kilo: ");
        int muz = in.nextInt();
        System.out.print("Patlıcan Kaç Kilo: ");
        int patlican = in.nextInt();
        in.close();
        double tutar = (armut * armutF) + (elma * elmaF) + (domates * domatesF) + (muz * muzF) + (patlican * patlicanF);
        System.out.println("Toplam tutar: " + tutar + " TL");

    }
}
