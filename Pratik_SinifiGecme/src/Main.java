import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        System.out.println("Matematik notunuz: ");
        mat = in.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = in.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = in.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = in.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = in.nextInt();
        in.close();
        double ort = (float) (mat + fizik + kimya + turkce + muzik) / 5;
        if (ort < 55) {
            System.out.println("Ortalamanız: " + ort + "\nDersten kaldınız.");
        } else {
            System.out.println("Ortalamanız: " + ort + "\nDersi geçtiniz.");
        }
    }
}
