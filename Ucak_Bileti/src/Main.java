import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double fiyat, indirim, indirimliFiyat, yonIndirimi;
        Scanner in = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz (KM): ");
        mesafe = in.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = in.nextInt();
        System.out.println("Yolculuk tipinizi seçiniz (Tek yön için 1 - Çift Yön için 2): ");
        yolculukTipi = in.nextInt();
        fiyat = mesafe * 0.10;
        if ((mesafe <= 0) || (yas <= 0) || (yolculukTipi < 1 || yolculukTipi > 2))
            System.out.println("Hatalı veri girişi.");
        if (yas < 12) {
            indirim = fiyat * 0.50;
            indirimliFiyat = fiyat - indirim;
        } else if (yas <= 24) {
            indirim = fiyat * 0.10;
            indirimliFiyat = fiyat - indirim;
        } else if (yas >= 65) {
            indirim = fiyat * 0.30;
            indirimliFiyat = fiyat - indirim;
        } else {
            indirimliFiyat = fiyat;
        }
        if (yolculukTipi == 2) {
            yonIndirimi = indirimliFiyat - (indirimliFiyat * 0.20);
            System.out.println("Toplam Tutar: " + yonIndirimi * 2);
        } else if (yolculukTipi == 1) {
            System.out.println("Toplam Tutar: " + indirimliFiyat);
        }
    }
}