import java.util.List;

public class SumAndReduce {

    public static void main(String[] args) {

    }

    public static int calculate(List<Integer> numbers){
        int total = 0;
        for(int number: numbers){
            total += number;
        }
        return total;
    }

    public static int calculateStream(List<Integer> numbers){
        //return numbers.stream().reduce((i, sum) -> i+sum).orElse(0);
        return numbers.stream()
                .reduce(Integer::sum)
                .orElse(0);
    }
}
