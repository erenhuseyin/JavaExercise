public class While {

    public static void main(String[] args) {

        int x = 1;
        int total = 0;
        while (x <= 10) {
            int y = x * x;
            System.out.print(y + " ");
            total += y;
            ++x; //TODO ask that what is the difference between ++x and x++
        }

        System.out.printf("\nTotal is %d%n", total);//printf format print
        //%s string
        //%d decimal
        //%f float number
        //%t time
    }
}
