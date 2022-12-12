package lessonThree;

public class RecursiveFunc {
    /*
    f(1) = 1
    f(2) = f(1) + 2 = 1 + 2
    f(3) = f(2) + 3 = 1 + 2 + 3
    f(4) = f(3) + 4 = 1 + 2 + 3 + 4
    f(n) = n + n-1 + n-2 + .... + 1
    f(n) = f(n-1) + n
     */

    static int f(int n){
        int result = 0;
        for(int i =1 ; i<=n ; i++){//iterator(yineleyici)
            result += i;
        }
        return result;
    }

    //https://www.twitch.tv/folksdev/video/907918024
    //49:54



    static int rf(int n){
        if(n == 1){//metodun bitmesi gereken yer
            return 1;
        }
        return rf(n-1) + n;
    }

    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }

    public static void main(String[] args) {

        System.out.println(f(5));

        System.out.println(rf(5));

        System.out.println("Basamak toplami: "+basamaklarToplami(45612));

        

        

    }
}
