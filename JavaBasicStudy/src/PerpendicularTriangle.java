public class PerpendicularTriangle {
    public static void main(String[] args) {
/*
         a)                  b)
         *                  **********
         **                  *********
         ***                  ********
         ****                  *******
         *****                  ******
         ******                  *****
         *******                  ****
         ********                  ***
         *********                  **
         **********                  *
*/

        int rowNumber = 10;


        drawLeftBottomCenterPerpendicularTriangle(rowNumber);

        System.out.println();

        drawLeftTopCenterPerpendicularTriangle(rowNumber);

    }

    private static void drawLeftBottomCenterPerpendicularTriangle(int rowNumber) {
        for (int i = 0; i <= rowNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawLeftTopCenterPerpendicularTriangle(int rowNumber) {
        for(int i = 0; i<rowNumber;i++){
            for(int j = rowNumber-i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
