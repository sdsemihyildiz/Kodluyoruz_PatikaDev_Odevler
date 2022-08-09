import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Kullanıcı adı giriniz: ");
        String userName = in.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        String password = in.nextLine();
        in.close();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarılı bir şekilde giriş yaptınız.");

        } else {
            System.out.println("Lütfen bilgilerinizi kontrol ediniz.");
        }


    }
}
