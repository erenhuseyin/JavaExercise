import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {
        
        getTotalNumberOfLettersOfNamesLongerThanFive();
    }

    //Array elemanlarini al => stream()
    //5ten uzun isimleri filtreleme => filter()
    //Geri kalan listedeki harflerin sayısını => mapToInt()
    //harf sayılarını topla => sum()
    private static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(name -> name.length() > 5)//Stream<String>
                .mapToInt(String::length)//Stream<Integer>, if koşulu gibi çalışır if(name.length()>5)
                .sum();
    }
}
