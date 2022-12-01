import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.singletonList;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(getString(Arrays.asList(3,44)));//o3, e44
        System.out.println(getString(singletonList(3)));//o3
    }

    //method: sayılar tek ise önüne o, çift ise önüne e harfi konulacak

    public static String getString(List<Integer> list){
        return list.stream()
                .map(i -> {//parantez içinde fonk yazdık
                    String s = "";
                    if(i % 2 == 0){
                        s += "e" + i;
                    }else{
                        s += "o" + i;
                    }
                    return s;
                })//Stream<String>
                .collect(Collectors.joining(", "));
    }
    //map değer dönmek zorunda, değer dönmeyip değişiklik yapacaksak forEach kullanmalıyız
}
