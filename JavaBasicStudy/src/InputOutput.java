import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        char gender = sc.nextLine().charAt(0);

        int age = sc.nextInt();
        long telNo = sc.nextLong();
        double gradeAverage = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Telephone number: " + telNo);
        System.out.println("Grade Average: " + gradeAverage);

    }
}
