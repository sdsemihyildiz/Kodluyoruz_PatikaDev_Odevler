import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklık;

        Scanner in = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklık = in.nextInt();
        in.close();

        if (sicaklık < 5) {
            System.out.println("Doğal gazı yakmalısın");
        } else if (sicaklık>=5 && sicaklık <=15) {
            System.out.println("Sıcak bir kahve ile dışarıyı izleyebilirsiniz.");
        } else if (sicaklık>=15 && sicaklık <=25) {
            System.out.println("Pikniğe gidebilirsin.");
        } else if (sicaklık>25) {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}