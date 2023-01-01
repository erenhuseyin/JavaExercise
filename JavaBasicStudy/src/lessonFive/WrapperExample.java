package lessonFive;

public class WrapperExample {

    public static void main(String[] args) {
        //wrapper işlemler
        int number = 46;
        double numberd = 46.3;
        String str = Integer.toString(number);
        String strd = Double.toString(number);
        System.out.println("Sayi int tipinde: "+number);
        System.out.println("Sayi double tipinde: "+numberd);
        System.out.println("Sayi string tipinde: "+str);
        System.out.println("Sayi string tipinde: "+strd);
        //autoboxing ve unboxing

        int primitiveInt = 1;
        Integer intObject = primitiveInt;
        int intValue = intObject;

        System.out.println(primitiveInt);//int
        System.out.println(intObject);//Integer
        System.out.println(intValue);//int

        double primitiveDouble = 1.0d;
        Double doubleObject = primitiveDouble;
        double doubleValue = doubleObject;

        System.out.println(primitiveDouble);
        System.out.println(doubleObject);
        System.out.println(doubleValue);
    }
}
