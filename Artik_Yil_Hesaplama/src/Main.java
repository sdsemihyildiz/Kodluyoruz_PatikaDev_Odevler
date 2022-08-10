import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yil = in.nextInt();
        in.close();
        boolean artik;
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            } else
                artik = true;
        } else
            artik = false;
        if (artik)
            System.out.println(yil + " bir artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");
    }
}