package careercupQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
You have three Arrays.
A = {2, 5, 3, 2, 8,1}
B = {7, 9, 5, 2, 4, 10, 10}
C = {6, 7, 5, 5, 3, 7}

s1 = A&B - 2,5,3,8,1,7,9,4,10
s2 = A&C -
s3 = B&C -

result = s(s1+s2+s3)

make an array from this three arrays which elements is present in at least two array.

This question was followed by instead of three arrays. If you have a list of array then what will be the solution? Also what will be the time complexity?

- monowar1993 June 14, 2019 in Netherlands
 */
public class PracticeOne {

    public static void presentTwoElements(int[] A, int[] B, int[] C){

        List<Integer> AA = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());//boxed metodu primitive type'ı objeye çevirir

        List<Integer> BB = Arrays.stream(B)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> CC = Arrays.stream(C)
                .boxed()
                .collect(Collectors.toList());

        //3 diziyi listeye çevirdik
        //tekrar edilme olmadığı için sete çevirmeliyiz

        Set<Integer> s1 = Stream.of(AA,BB)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        Set<Integer> s2 = Stream.of(AA,CC)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        Set<Integer> s3 = Stream.of(BB,CC)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        Set<Integer> s4 = Stream.of(s1,s2,s3)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        Set<Integer> result = s4.stream()
                .filter(x -> (AA.contains(x) && BB.contains(x)) ||
                             (AA.contains(x) && CC.contains(x)) ||
                             (BB.contains(x) && CC.contains(x)))//containt, var mı yok mu diye kontrol eder
                .collect(Collectors.toSet());

        System.out.println(result);
    }


    public static void main(String[] args) {
        int[] A = {2, 5, 3, 2, 8,1};
        int[] B = {7, 9, 5, 2, 4, 10, 10};
        int[] C = {6, 7, 5, 5, 3, 7};

        presentTwoElements(A, B, C);

        /*
        sonuç -> [2, 3, 5, 7]
        eğer set yazmasaydık dizinin içerisinde 3 kere 5 değeri olurdu
        5 değeri hem AB'de hem AC'de hem de BC'de ortak
         */

    }
}
