public class Base {
    public static void main(String[] args) {

        boolean flag = true;
        char ch = 'a';//tek tırnak
        byte b = 12;
        short s = 24;
        int i = 257;
        long l = 890L;//L zorunlu değil
        float f = 3.1314F;//f zorunlu
        double d = 2.1828;

        /*
            boolean flag; -> declaration (bildirmek)
            flag = true; -> initialize(atama işlemi)
         */

        System.out.println("flag = " + flag);
        System.out.println("ch = " + ch);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

    }
}
