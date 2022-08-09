import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r, pi = 3.14;
        int a;
        System.out.println("Yarıçap giriniz: ");
        r = in.nextDouble();
        System.out.println("Açıyı giriniz: ");
        a = in.nextInt();
        if (a <= 0 || a > 360) {
            System.out.println("Hatalı veri girdiniz");
        } else {
            double alan = (pi * (r * r) * a) / 360;
            System.out.println("Daire diliminin alanı: " + alan);
        }


    }
}
