import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        double alan = 0;
        System.out.println("Üçgenin kenarlarını giriniz:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        in.close();
        int ucgeninCevresi = (a + b + c);
        int u = ucgeninCevresi / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
