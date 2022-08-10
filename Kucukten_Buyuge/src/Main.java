import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Birinci sayı: ");
        a = in.nextInt();
        System.out.println("İkinci sayı: ");
        b = in.nextInt();
        System.out.println("Üçüncü sayı: ");
        c = in.nextInt();
        in.close();
        if (a > b && a > c) {
            System.out.println("En büyük sayı: " + a);
        } else if (b > a && b > c) {
            System.out.println("En büyük sayı: " + b);

        } else {
            System.out.println("En büyük sayı: " + c);
        }
    }
}
