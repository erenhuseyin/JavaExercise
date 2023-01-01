package lessonFour;

public class IntroductionOop {
    public static class RectangularPrism{
        double width;
        double height;
        double depth;

        double getVolume(){//hacim
            return width*height*depth;
        }
        double getArea(){//alan
            return 2*(width*height+width*depth+height*depth);
        }

        public RectangularPrism(double width, double height, double depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
    }

    public static void main(String[] args) {
        RectangularPrism rectangular = new RectangularPrism(3,5,9);
        rectangular.width = 3;
        rectangular.height = 4;
        rectangular.depth = 5;



        double volume = rectangular.getVolume();
        double area = rectangular.getArea();
        System.out.println(volume);
        System.out.println(area);
    }
}
