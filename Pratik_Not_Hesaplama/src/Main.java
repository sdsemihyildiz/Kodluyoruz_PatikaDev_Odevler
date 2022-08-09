import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner in = new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        mat = in.nextInt();
        System.out.println("Fizik Notunuz: ");
        fizik = in.nextInt();
        System.out.println("Kimya Notunuz: ");
        kimya = in.nextInt();
        System.out.println("Türkçe Notunuz: ");
        turkce = in.nextInt();
        System.out.println("Tarih Notunuz: ");
        tarih = in.nextInt();
        System.out.println("Müzik Notunuz: ");
        muzik = in.nextInt();
        in.close();
        double sonuc = (mat + fizik + kimya + tarih + turkce + muzik) / 6.0;
        if (sonuc < 60) {
            System.out.println("Not Ortalamanız: " + sonuc + "| Sınıfta Kaldı.");
        } else {
            System.out.println("Not Ortalamanız: " + sonuc + "| Sınıfı geçtiniz.");
        }

    }
}
