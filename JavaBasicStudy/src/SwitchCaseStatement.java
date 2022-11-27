import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int b1 = scanner.nextInt();

        int b4 = scanner.nextInt();

        int o = scanner.nextInt();

        switch (b1){
            case 1:
                System.out.println("glock eklendi");
                break;
            case 2:
                System.out.println("susturuculu tabanca eklendi");
                break;
            case 3:
                System.out.println("p228 eklendi");
                break;
            case 4:
                System.out.println("d.eagle eklendi");
                break;
            case 5:
                System.out.println("çift tabanca eklendi");
                break;
            default:
                System.out.println("yanlış seçim");
                break;
        }

        switch (o) {
            case 1:
                System.out.println("kask eklendi");
                break;
            case 2:
                System.out.println("kask + çelik yelek eklendi");
                break;
            case 3:
                System.out.println("sis eklendi");
                break;
            case 4:
                System.out.println("flaş eklendi");
                break;
            case 5:
                System.out.println("el bombası eklendi");
                break;
            default:
                System.out.println("yanlış seçim");
                break;
        }


    }
}
