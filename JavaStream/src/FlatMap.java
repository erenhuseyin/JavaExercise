import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

    }



    public static List<String> transform(List<List<String>> collection){
        List<String> newCollection = new ArrayList<>();
        for(List<String> subCollection : collection){
            for(String value : subCollection){
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    //nested list(iç içe geçmiş list) ait değerleri al => stream()
    //her bir elemanı bir listeye ekle ve return et => flatMap

    public static List<String> transformStream(List<List<String>> collection){
        return collection.stream()
                .flatMap(Collection::stream)//Stream<Stream<String>> -> Stream<String>
                .collect(Collectors.toList()); //Stream<String> -> List<String>
    }

}
