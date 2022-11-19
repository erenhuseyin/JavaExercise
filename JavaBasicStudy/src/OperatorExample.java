public class OperatorExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = a++ + ++b;//prefix and postfix
        int sum = a+b+c;

        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
        System.out.print(sum);
    }
}
