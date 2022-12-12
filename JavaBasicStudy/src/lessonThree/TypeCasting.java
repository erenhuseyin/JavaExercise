package lessonThree;

public class TypeCasting {


    public static void main(String[] args) {
        int i1 = 5; //00000000 00000000 00000000 00001010
        double d1 = i1; //.... 00000000 00000000 00000000 00001010
        System.out.println(d1);

        /*double d2 = 5.2;
        int i2 = d2;*/

        double d2 = 5.2;
        int i2 = (int) d2;
        System.out.println(i2);

        char ch2 = 'T';
        int i3 = ch2;
        System.out.println(i3);

        float f3 = 65f;
        char c3 = (char) f3;
        System.out.println(c3);

        int sayi1 = 3;
        double sayi2 = 3.14;
        int yuvarlama = (int) (sayi1+sayi2);


        short s1 = 127; //0000 0000 0111 1111
        byte b1 = (byte) s1; //     0111 1111
        System.out.println(b1);

        short s2 = 127; //0000 0000 1000 0000
        byte b2 = (byte) s2; //     1000 0000
        System.out.println(b2);
    }
}
