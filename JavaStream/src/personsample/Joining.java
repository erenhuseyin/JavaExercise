package personsample;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToStringStream(List<Person> people) {
        return "Names: " +
                people.stream()
                        .map(Person::getName)
                        .reduce((i, sum) -> i + "," + sum)
                        .orElse("") +
                ".";
    }

    public static String namesToStringStreamJoining(List<Person> people) {
        return "Names: " +
                people.stream()
                        .map(Person::getName)
                        .collect(Collectors.joining(", ")) +//delimiter nesnelerin arasına koymak demektir.
        ".";
    }
}
