package lessonTwo;

import java.util.Scanner;

public class FunctionBasic {

    public static void main(String[] args) {


        helloWorld();
        writeMessage("hello world");

        int sonuc = topla(3,5);
        System.out.println(sonuc);

        System.out.println(topla(2,6));
        System.out.println(topla("bu bir","String"));
        System.out.println(topla(2,6, 8));

        System.out.println(cube(4));

        System.out.println(graduateExam(6));

        if(checkBusTicket()){
            System.out.println("otobüse binebilirsiniz");
        }else{
            System.out.println("otobüse binemezsiniz");
        }


    }

    static void helloWorld(){
        System.out.println("hello world");
    }

    static void writeMessage(String message){
        System.out.println(message);
    }

    static int topla(int x, int y){
        return x+y;
    }

    //overloading
    static int topla(int x, int y, int z){
        return x+y+z;
    }

    static String topla(String x, String y){
        return x+" "+y;
    }

    static int cube(int sayi){
        int result = sayi * sayi * sayi;
        return result;
    }


    static boolean graduateExam(int grade){
        if(grade >= 5){
            return true;
        } else{
            return false;
        }
    }

    static boolean checkBusTicket(){
        Scanner scanner = new Scanner(System.in);
        String answer;

        System.out.println("biletiniz var mı? [Y] [N]");
        answer = scanner.next();

        if(answer.equals("Y")){
            return true;
        }else {
            System.out.println("abonmanınız var mı? [Y] [N]");
            answer = scanner.next();
            if(answer.equals("Y")){
                return true;
            }
        }
        return false;
    }




}
