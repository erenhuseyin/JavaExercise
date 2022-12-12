package lessonThree;

import java.util.Arrays;

public class ArraysLesson {

    public static void main(String[] args) {

        String[] cars;

        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};

        int[] myNum = {10, 20, 30, 40};

        //------------------------------------------------

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2[0]);
        // Outputs Volvo

        //------------------------------------------------

        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars3[0] = "Opel";
        System.out.println(cars3[0]);
        // Now outputs Opel instead of Volvo

        //------------------------------------------------

        String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars4.length);
        // Outputs 4

        //------------------------------------------------

        String[] cars5 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars5.length; i++) {
            System.out.println(cars5[i]);
        }

        //------------------------------------------------
        //forEach(java8)

        int[] numbers = {1, 2, 3, 4, 5};

        for(int i= 0; i< numbers.length;i++){
            int number =numbers[i];
            System.out.println(number);

        }

        // Dizinin tüm elemanlarını gezerek ekrana yazdırma
        for (int number : numbers) {
            System.out.println(number);
        }

        //------------------------------------------------

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 27

    }

}
