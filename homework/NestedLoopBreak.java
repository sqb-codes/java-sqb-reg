package homework;

public class NestedLoopBreak {
    public static void main(String[] args) {


        System.out.println("VERSION 1");

        xLoop:
        for (int x = 1; x <= 5; x++) {

            for (int y = 1; y <= 5; y++) {

                System.out.println(x + " " + y);

                if (x == 3 && y == 3) {
                    break xLoop;
                }
            }
        }



        System.out.println("\nVERSION 2");

        boolean breakOuter = false;

        for (int x = 1; x <= 5; x++) {

            for (int y = 1; y <= 5; y++) {

                System.out.println(x + " " + y);

                if (x == 3 && y == 3) {
                    breakOuter = true;
                }
            }

            if (breakOuter) {
                break;
            }
        }
    }
}