package projeaksiyon;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {

        int sonuc1 = topla(5,6);
        int sonuc2 = topla(8,10);

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        String bilgi1 = sahsiBilgiler("Huseyin Eren", 2000, "Malatya");
        String bilgi2 = sahsiBilgiler("Ahmet Okan Uzun", 2006, "Bingöl");
        System.out.println(bilgi1);
        System.out.println(bilgi2);

        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        String islem = scanner.next();

        hesapMakinesi(sayi1, sayi2, islem);
    }

    static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    static int hesapMakinesi(int sayi1, int sayi2, String islem){

        int sonuc = 0;
        if(islem.equals("+")){
            sonuc = sayi1 + sayi2;
        } else if (islem.equals("-")) {
            sonuc = sayi1 - sayi2;
        } else if (islem.equals("*")) {
            sonuc = sayi1 * sayi2;
        } else if (islem.equals("/")) {
            sonuc = sayi1 / sayi2;
        }else{
            System.out.println("Yanlış işlem türü girdiniz.");
        }

        if(islem.equals("+") || islem.equals("-") || islem.equals("*") || islem.equals("/")){
            System.out.println(sayi1 + islem + sayi2 + "=" + sonuc);
        }
        return sonuc;
    }

    static String sahsiBilgiler(String adSoyad, int dogumTarihi, String memleket){
        return "Kişinin adı soyadı: " + adSoyad + ", doğum tarihi: " + dogumTarihi + ", memleketi " + memleket + ".";
    }
}
