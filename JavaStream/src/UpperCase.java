import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {

    public static void main(String[] args) {

        System.out.println(mapToUpperCase("arjantin", "brezilya", "portekiz", "almanya"));

        System.out.println(mapToUpperCaseStream("ispanya", "hollanda", "ekvador", "uruguay"));

    }

    public static Collection<String> mapToUpperCase(String... names){
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names){
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    //array elemanlarının tamamını al => stream()
    //buyuk harflere cevir(upper case) => map()
    //liste olarak geri dön => collect()

    public static Collection<String> mapToUpperCaseStream(String... names){
        //return Arrays.stream(names).map(name -> name.toUpperCase()).collect(Collectors.toList());
        return Arrays.stream(names)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }
}
