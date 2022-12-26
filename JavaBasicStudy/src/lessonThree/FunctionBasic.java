package lessonThree;

import java.util.Scanner;

public class FunctionBasic
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ders notunuzu giriniz:");
        double puan = scanner.nextDouble();

        if(2.0 <= puan & puan <= 4.0)
        {
            System.out.print("Dersi geçtin.");
        }
        else if(puan > 4.0){
            System.out.println("tanımlanamayan not");
        }

        else if(puan <= 0.0){
            System.out.println("tanımlanamayan not");
        }

        else {
            System.out.print("Dersi geçemedin.");
        }

    }
}