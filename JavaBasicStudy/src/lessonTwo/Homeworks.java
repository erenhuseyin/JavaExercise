package lessonTwo;

public class Homeworks {

    public static void main(String[] args) {

        int rowNumber = 10;

        drawLeftTopCenterPerpendicularTriangle(rowNumber);


        System.out.println(graduateExam(12.5));
        System.out.println(graduateExam(8.5));
        System.out.println(graduateExam(3.5));
        System.out.println(graduateExam(-5.7));

    }

    private static void drawLeftTopCenterPerpendicularTriangle(int rowNumber) {
        for(int i = 0; i<rowNumber;i++){
            for(int j = rowNumber-i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static String graduateExam(double grade){
        String messageInvalid = "you entered an invalid value";
        String messagePassed = "you passed";
        String messageFailed = "you failed";
        if(grade >= 2.0 && grade <= 4.0){
            return messagePassed;
        } else if (grade < 2 && grade > 0 ) {
            return messageFailed;
        }else{
            return messageInvalid;
        }
    }
}
