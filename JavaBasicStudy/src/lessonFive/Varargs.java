package lessonFive;

public class Varargs {

    /*
    public static int add(int x, int y){
        return x+y;
    }

    public static int add(int x, int y, int z){
        return x+y+z;
    }
    */

    public static int add(int... numbers){//varargs
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add(3,5,8));
        System.out.println(add(3,5,8,9,10,15));
        System.out.println(add(3));

    }
}
