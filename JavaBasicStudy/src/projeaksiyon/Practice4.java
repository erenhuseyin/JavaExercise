package projeaksiyon;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        /*int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        if(sayi1 > sayi2){
            System.out.println("1. if true");
        }else{
            System.out.println("1. if false");
        }

        if(sayi1 < sayi2)
            System.out.println("2. if doğru");

        if(sayi3 > sayi4){
            System.out.println("3. if true");
        }else if (sayi4 > sayi5) {
            System.out.println("4. if true");
        }else if (sayi1 > sayi5) {
            System.out.println("son");
        }else {

        }

         */

        System.out.println("Refahiye Belediyesi Toplu Ulaşım Kart Sistemi");
        String adSoyad;
        int yas;
        int bakiye;

        Scanner user = new Scanner(System.in);

        System.out.print("İsim Soyisim: ");
        adSoyad = user.nextLine();

        System.out.print("Yaş: ");
        yas = user.nextInt();

        user.nextLine();

        System.out.print("Bakiye: ");
        bakiye = user.nextInt();

        user.nextLine();

        if(bakiye > 10 && yas >= 18){
            bakiye -= 10;
            System.out.println("İşlem Başarılı. Mevcut bakiye: " + bakiye);
        }else if (yas < 18){
            System.out.println("İşlem Başarılı, ücretsiz gençkart geçişi");
        }else if(bakiye < 10){
            System.out.println("Bakiye yetersiz. En yakın noktadan bakiye yükleyiniz.");
        }else{
            System.out.println("İşleminiz sırarsında hata oluştu");
        }


    }


}
