import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız");
        }else
            System.out.println("Bilgileriniz Yanlış!");
        System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır)");

        String reset;
        String resetChoice = inp.nextLine();

        if (resetChoice.equalsIgnoreCase("Evet")){
            System.out.println("Yeni Şifre : ");

            String newPassword = inp.nextLine();
            if (!newPassword.equals(password)){
                password = newPassword;
                System.out.println("Şifre oluşturuldu");


            }else{
                System.out.println("Şirfe oluşturulamadı, yeni şifre eski şifre ile aynı olamaz.");
            }

        }
    }
}
