import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kg; double boy;
        System.out.print("Lüfen boyunuzu (metre cinsinde) giriniz: ");
        boy = in.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = in.nextInt();
        in.close();
        double vki = (double) kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: "+vki);

    }
}
