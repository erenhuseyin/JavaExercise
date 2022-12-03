package lessonTwo;

public class TrickyWhile {
    public static void main(String[] args) {

        bloodUsWithProcess(3);
    }



    private static void bloodUsWithProcess(int limit) {
        int sum = 0;
        while(limit>=0){
            sum += limit;
            System.out.println(sum + " ");
        }
    }


}
