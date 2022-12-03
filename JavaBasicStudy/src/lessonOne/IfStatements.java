package lessonOne;

import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {

        //NUMBER CONTROL
/*
        int number = -5;

        if (number == 0) {
            System.out.println("sayı 0");
        }
        else if (number < 0) {
            System.out.println("sayı negatif");
        }
        else if (number > 0) {
            System.out.println("sayı pozitif");
        }

 */

        //PASSWORD CONTROL

        int password = 12345;
        int oldPassword = 54321;

        Scanner sc = new Scanner(System.in);

        String inputPassword = sc.nextLine();

        int myPassword = Integer.parseInt(inputPassword);


        if (myPassword == password) {
            System.out.println("giriş başarılı");
        } else if (myPassword == oldPassword) {
            System.out.println("eski şifreyi girdiniz");
        } else {//look at the tips
            System.out.println("Tekrar deneyiniz");
        }



    }
}
