package projeaksiyon;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int belge = scanner.nextInt();

        /*switch(belge){
            case 1:
                System.out.println("DURUM BAŞARILI");
                break;
            case 2:
                System.out.println("DURUM BAŞARISIZ");
                break;
            case 3:
                System.out.println("DURUM BEKLEMEDE");
                break;
            case 4:
                System.out.println("DURUM İPTAL EDİLDİ");
                break;
            default:
                System.out.println("HATA ALDI");
        }



        if (belge == 1) {
            System.out.println("DURUM BAŞARILI");
        } else if (belge == 2) {
            System.out.println("DURUM BAŞARISIZ");
        } else if (belge == 3) {
            System.out.println("DURUM BEKLEMEDE");
        } else if (belge == 4) {
            System.out.println("DURUM İPTAL EDİLDİ");
        } else {
            System.out.println("HATA ALDI");
        }



        int eskiSifre1 = 456;
        int eskiSifre2 = 234;
        int eskiSifre3 = 547546;

        int yeniSifre = scanner.nextInt();

        if(yeniSifre == eskiSifre1 ){
            System.out.println("Son üç şifreniz aynı olmamalıdır 1");
        } else if (yeniSifre == eskiSifre2) {
            System.out.println("Son üç şifreniz aynı olmamalıdır 2");
        }else if (yeniSifre == eskiSifre3) {
            System.out.println("Son üç şifreniz aynı olmamalıdır 3");
        }else{
            System.out.println("şifreniz başarılı bir şekilde değişti");
        }

        if(yeniSifre == eskiSifre1 || yeniSifre == eskiSifre2 || yeniSifre == eskiSifre3){
            System.out.println("Son üç şifreniz aynı olmamalıdır 1");
        }

        if(yeniSifre != eskiSifre1 && yeniSifre != eskiSifre2 && yeniSifre != eskiSifre3){
            System.out.println("Son üç şifrenizden farklı");
        }

         */

        /*boolean hastalikliMi = true;
        int boy = 180;

        if(!hastalikliMi && boy>178){
            System.out.println("takıma girer");
        }

         */

        int sayi = scanner.nextInt();
        //int karesi = sayi * sayi;
        //System.out.println(karesi);

        if (sayi > 0) {
            System.out.println("pozitif");
        } else if (sayi < 0) {
            System.out.println("negatif");
        }else{
            System.out.println("sayı 0");
        }

    }

}
