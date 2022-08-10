import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gun, ay;
        String burc = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Doğum ayınız: ");
        ay = in.nextInt();

        System.out.print("Doğum gününüz: ");
        gun = in.nextInt();


        if(ay >= 1 && ay <=12 && gun >= 1) {

            if((ay == 1) && (gun <= 21) || (ay == 12) &&(gun > 22 && gun <= 31))
                burc = "Oglak";

            else if ( ((ay == 1) && (gun >21 && gun <= 31)) || ( ay == 2 && gun <= 19 ) )
                burc = "Kova";

            else if ( ((ay == 2) && (gun > 19 && gun <= 29)) || ( ay ==3 && gun <= 2) )
                burc = "Balık";

            else if ( ((ay == 3) && (gun > 20 && gun <= 31)) || (ay == 4 && gun <= 20) )
                burc = "Koç";

            else if( ((ay == 4) &&(gun > 20 && gun <= 30)) || (ay == 5 && gun <= 21) )
                burc = "Boğa";

            else if ( ((ay == 5) && (gun > 21 && gun <= 31)) || (ay == 6 && gun <= 22) )
                burc = "İkizler";

            else if ( ((ay == 6) && (gun > 22 && gun <= 30)) || (ay == 7 && gun <= 22) )
                burc = "Yengeç";

            else if( (ay == 7) && (gun > 22 && gun <= 31) || (ay == 8) && (gun <= 22) )
                burc = "Aslan";

            else if ( (ay == 8) && (gun > 22 && gun <= 31) || (ay == 9 && gun <= 22) )
                burc = "Başak";

            else if ( (ay == 9) && (gun > 22 && gun <= 30) || (ay == 10 && gun <= 22) )
                burc = "Terazi";

            else if ( (ay == 10) && (gun > 22 && gun <= 31) || (ay == 11 && gun < 22) )
                burc = "Akrep";

            else if( (ay == 11) &&(gun >= 22 && gun <= 30) || (ay == 12 &&gun < 22) )
                burc = "Yay";

            else
                System.out.println("Tarih bulunamadı.Doğum gününüzü 1-31 arasında giriniz.");

        }

        else
            System.out.println("Tarih bulunamadı.Doğum ayınızı 1-12 arasında giriniz.");

        System.out.println("Burcunuz: "+burc);

    }
}