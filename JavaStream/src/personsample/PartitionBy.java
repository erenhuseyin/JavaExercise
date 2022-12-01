package personsample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {

    public static void main(String[] args) {

    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people){
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for(Person person : people){
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdultsStream(List<Person> people){
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge() >= 18, Collectors.toList()));//18 yaşından büyük olanları ve olmayanları gruplarız
        //people.stream().filter(person.getAge() >= 18).collect(Collectors.toList()); -> sadece 18 yaşından büyükleri alır
     }
}
