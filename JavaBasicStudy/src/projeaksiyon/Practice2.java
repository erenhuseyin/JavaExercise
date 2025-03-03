package projeaksiyon;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("İsim Soyisim: ");
        String nameSurname = user.nextLine();

        System.out.print("Yaş: ");
        int age = user.nextInt();
        user.nextLine(); // **Tamponu temizle**

        System.out.print("Telefon Numarası: ");
        Long phoneNumber = user.nextLong();
        user.nextLine(); // **Tamponu temizle**

        System.out.print("Cinsiyet (E/K): ");
        char gender = user.next().charAt(0);
        user.nextLine(); // **Tamponu temizle**

        System.out.print("Adres: ");
        String address = user.nextLine(); // Burada artık tüm satırı okuyabilir

        System.out.print("Boy: ");
        double height = user.nextDouble();

        System.out.println("\n--- Kullanıcı Bilgileri ---");
        System.out.println("İsim Soyisim: " + nameSurname);
        System.out.println("Yaş: " + age);
        System.out.println("Telefon Numarası: " + phoneNumber);
        System.out.println("Cinsiyet: " + gender);
        System.out.println("Adres: " + address);
        System.out.println("Boy: " + height);
    }
}
