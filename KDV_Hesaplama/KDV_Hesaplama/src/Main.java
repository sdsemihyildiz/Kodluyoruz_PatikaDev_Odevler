import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double kdvTutar, kdvliTutar = 0;
        System.out.println("Ürünün fiyatını giriniz: ");
        double tutar = in.nextDouble();
        if (tutar >= 1000) {
            kdvTutar = 0.08;
            kdvliTutar += tutar + (tutar * kdvTutar);
            System.out.println("Ürünün kdvli fiyatı: " + kdvliTutar);
        } else if (tutar < 1000 && tutar >= 0) {
            kdvTutar = 0.18;
            kdvliTutar += tutar + (tutar * kdvTutar);
            System.out.println("Ürünün kdvli fiyatı: " + kdvliTutar);
        } else {
            System.out.println("Hatalı fiyat girdiniz.");
        }

    }
}
