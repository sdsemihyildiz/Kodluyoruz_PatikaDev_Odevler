import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, secim;
        Scanner in = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        n1 = in.nextInt();
        System.out.print("İkinci sayı: ");
        n2 = in.nextInt();
        System.out.println("1-Toplama\n" + "2-Çıkarma\n" + "3-Çarpma\n" + "4-Bölme");
        System.out.print("Seçiminiz: ");
        secim = in.nextInt();
        in.close();
        switch (secim) {
            case 1:
                int toplam = n1 + n2;
                System.out.println("Toplama işlemi sonucu: " + toplam);
                break;
            case 2:
                int cikarma = n1 - n2;
                if (cikarma < 0) {
                    cikarma = -1 * (n1 - n2);
                    System.out.println("Çıkarma işlemi sonucu: " + cikarma);
                } else {
                    cikarma = n1 - n2;
                    System.out.println("Çıkarma işlemi sonucu: " + cikarma);
                }
                break;
            case 3:
                int carpma = n1 * n2;
                System.out.println("Çarpma işlemi sonucu: " + carpma);
                break;
            case 4:
                double bolme = (float) n1 / n2;
                System.out.println("Bölme işleminin sonucu: " + bolme);
        }
    }
}
